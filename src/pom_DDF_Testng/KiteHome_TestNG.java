package pom_DDF_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHome_TestNG {
@FindBy(xpath="//span[@class='user-id']")private WebElement USERID;
    
    public KiteHome_TestNG(WebDriver driver) {
 	
 	  PageFactory.initElements(driver,this);
    }
 // Important Step method declaration with return type  
    public String verifyUSERID() {
  	
 	String actID = USERID.getText();
 	return actID;
 }
    
}
