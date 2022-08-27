package pom_DDF_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePIN_Testng {
	    // Declaration
		@FindBy (xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy (xpath="//button[@class='button-orange wide']")private WebElement PINLOGBUTTON;
		
		// Intialization
		public KitePIN_Testng(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		// Utilization
		public void enterPIN(String PINV) {
			PIN.sendKeys(PINV);
		}
		public void clickPINLOGINBUTTON() {
			PINLOGBUTTON.click();
		}
}
