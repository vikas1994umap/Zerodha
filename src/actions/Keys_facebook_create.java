package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_facebook_create {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click(); //click on create
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//select[@id='day']")).click();  // select day 
	  Thread.sleep(3000);
	  Actions act=new Actions(driver);
	  Thread.sleep(3000);
	  act.click().perform();
	  Thread.sleep(3000);
	  
	  act.sendKeys(Keys.ARROW_UP).perform();
	  act.sendKeys(Keys.ARROW_UP).perform();
	  
	  
	  
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  
	  Thread.sleep(3000);
	  act.sendKeys(Keys.HOME).perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ENTER).perform();
	  
	  
}
}
