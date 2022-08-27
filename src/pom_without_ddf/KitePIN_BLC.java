package pom_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePIN_BLC {
     // Declaration
	@FindBy (xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy (xpath="//button[@class='button-orange wide']")private WebElement PINLOGBUTTON;
	
	// Intialization
	public KitePIN_BLC(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	// Utilization
	public void enterPIN() {
		PIN.sendKeys("171992");
	}
	public void clickPINLOGINBUTTON() {
		PINLOGBUTTON.click();
	}
	
}
