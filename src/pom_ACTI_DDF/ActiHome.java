package pom_ACTI_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class ActiHome {
      @FindBy(xpath="//a[@class='userProfileLink username ']")private WebElement ACTIID;
    
    public ActiHome(WebDriver driver) {
 	
 	  PageFactory.initElements(driver,this);
 	
    }

    public void verifyACTIID(String expID) {

 	 String actID = ACTIID.getText();
 	 if(actID.equals(expID)) {
 		System.out.println("Test is Pass");
 	 }
 	 else {
 		System.out.println("Test is Fail");
 	 }
    }
    
 }   
    
  
 
	

