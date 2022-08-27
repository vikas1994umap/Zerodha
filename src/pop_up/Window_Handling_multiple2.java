package pop_up;

import java.util.ArrayList; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling_multiple2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
			
		//search --- Watches for men
	    driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("watches for men");
		//click on search button
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(3000);
	    //click on 1st watch so that new child window  will opens
	    driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[4]")).click();
			    
	    //by default Selenium control should be on main window we have switch it from main window to child
	    Set<String> allws = driver.getWindowHandles();
	    //use arraylist to store all windows
	   ArrayList<String> al=new ArrayList<String>(allws);
	   String cw = al.get(1);
	   System.out.println(cw);
	   
	   //print main window session id
	   String mainwin = al.get(0);
	   System.out.println(mainwin);
	   
	   //switch to main window
	   Thread.sleep(3000);
	   driver.switchTo().window(al.get(0));
	   
	   //for confirmation getTitle
	   String title = driver.getTitle();
	   System.out.println(title);
	}
}