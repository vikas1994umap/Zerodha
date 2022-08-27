package pom_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

       public class Acti_BLC {
	
		//Declaration
		@FindBy(xpath="//input[@id='username']")private WebElement UN;
		@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
		@FindBy(xpath="//div[text()='Login ']")private WebElement LOGINBUTTON;
		
		//Initialization
		public Acti_BLC(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
		
		//Utilization
		public void enterUN() {
			UN.sendKeys("admin");
		}
		public void enterPWD() {
			PWD.sendKeys("manager");
		}
		public void clickLOGINBUTTON(){
			LOGINBUTTON.click();
		}
		
	}

