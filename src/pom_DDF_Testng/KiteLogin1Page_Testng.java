package pom_DDF_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page_Testng {
	// STEP-1 Declaration
		@FindBy(xpath="//input[@id='userid']")private WebElement UN;
		@FindBy(xpath="//input[@id='password']")private WebElement PWD;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBUTTON;
		
		// STEP-2 Initialization
		public KiteLogin1Page_Testng(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		// STEP-3 UTILIZATION
		public void enterUN(String UN1) { 
			UN.sendKeys(UN1);
		}
		public void enterPWD(String PWD1) {
			PWD.sendKeys(PWD1);
		}
		public void clickLOGINBUTTON() {
			LOGINBUTTON.click();
		}
}
