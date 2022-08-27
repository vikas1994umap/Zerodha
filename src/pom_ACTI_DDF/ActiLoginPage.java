package pom_ACTI_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginPage {
	//Declaration
	@FindBy(xpath="//input[@id='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath="//div[text()='Login ']")private WebElement LOGINBUTTON;
	
	//Initialization
	public ActiLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void enterUN1(String User) {
		UN.sendKeys(User);
	}
	public void enterPWD1(String Pass) {
		PWD.sendKeys(Pass);
	}
	public void clickLOGINBUTTON(){
		LOGINBUTTON.click();
	}
	
}
