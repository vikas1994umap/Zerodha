package pop_up;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Window_Handling_Amazon {	
public static void main(String[] args) throws Throwable {
   System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.amazon.in/");
	
	    //search --- Watches for men
	    driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("watches for men");
	    //click on search button
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    Thread.sleep(3000);
	    //click on 1st watch so that new child window  will opens
	    driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
	    
	    //by default Selenium control should be on main window we have switch it from main window to child
	    Set<String> allw = driver.getWindowHandles();
	    for(String sw:allw) {
	    	driver.switchTo().window(sw);//now ur selenium control goes from main win to child
	    }
	    //get the text of child for our confirmation
	    Thread.sleep(3000);
	    String expT="Tommy Hilfiger Analog Blue Dial Men's Watch-TH1791474";
	    String actT = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
	    System.out.println(actT);
	    //verify the child window handle or not
	    Thread.sleep(3000);
	    if(actT.equals(expT)) {
	    	System.out.println("child window is handles and TC is pass");
	    }
	    else {
	    	System.out.println("Tc is fail");
	    }
	    
	}
}
