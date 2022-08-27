package pom_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class KiteHome_BLC {
       @FindBy(xpath="//span[@class='user-id']")private WebElement USERID;
       
    public KiteHome_BLC(WebDriver driver) {
    	
    	PageFactory.initElements(driver,this);
    }
    public void verifyUSERID() {
    	
    	String expID="DPG458";
    	String actID = USERID.getText();
    	if(actID.equals(expID)) {
    		System.out.println("Test is Pass");
    	}
    	else {
    		System.out.println("Test is Fail");
    	}
    }
       
}
