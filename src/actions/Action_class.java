package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(4000);
	//inspect for target element
	WebElement productName = driver.findElement(By.xpath("//div[@class='productName']"));
	Thread.sleep(4000);
	
	//create object of Actions class
	Actions act=new Actions(driver);
	Thread.sleep(4000);  
		  
	// act.moveToElement(productName).perform();      //---1 movetoelement()
		  
	// act.moveToElement(productName).contextClick().perform();  //---2 right click(contextclick())
		  
	// act.moveToElement(productName).click().perform();   //--3  left click/click()
		 
	// act.moveToElement(productName).doubleClick().perform();  //>>4 double click()
		 
	 act.moveToElement(productName).contextClick().doubleClick().build().perform();   //how to perform 3 actions in single statement
		 
		 
	}
}
