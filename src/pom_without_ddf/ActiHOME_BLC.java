package pom_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class ActiHOME_BLC {
       @FindBy(xpath="//a[@class='userProfileLink username ']")private WebElement ACTIID;
       
    public ActiHOME_BLC(WebDriver driver) {
    	
    	PageFactory.initElements(driver, this);
    }
    public void verifyACTIID() {

    	String expID="John Doe";
    	String actID = ACTIID.getText();
    	if(actID.equals(expID)) {
    		System.out.println("Test is Pass");
    	}
    	else {
    		System.out.println("Test is Fail");
    	}
    	
    }
    
    	
    	
    }
       

