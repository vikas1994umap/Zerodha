package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo_nextgenacademy_confirmalertbox {
	public static void main(String[] args) throws Throwable {
		
	
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click(); //click on confirm alert Box
	    Alert alt=driver.switchTo().alert();
	    Thread.sleep(4000);
	    //alt.accept();             // click on ok button 
	    // Thread.sleep(4000);
	  
	    alt.dismiss();            // click on cancel button 
	    Thread.sleep(4000);
	   
	    
	    driver.quit();
}
}
