package pom_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class QA_BLC {
    	//declaration
    	@FindBy(xpath="//input[@name='home']")private WebElement home;
    	
    	//Initialization
       public QA_BLC(WebDriver driver) {
    	   PageFactory.initElements(driver, this);
       }
    	
       //Utilization
       public void clickonHOME() {
    	   home.click();
       }
    	
    	
    	
    	
    }
	     
	   
		
		
		
		
		
	
