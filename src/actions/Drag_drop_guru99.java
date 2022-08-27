package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_guru99 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/drag_drop.html");
	  JavascriptExecutor jse= (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,-3000);");
	  Thread.sleep(3000); 
	  WebElement ele1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	  WebElement ele2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	  
      WebElement ele3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	  WebElement ele4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	  
	  
      WebElement ele5 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	  WebElement ele6 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	  
	  
      WebElement ele7 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	  WebElement ele8 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	  
	  Actions act=new Actions(driver);
	  act.dragAndDrop(ele1, ele2).dragAndDrop(ele3, ele4).dragAndDrop(ele5, ele6).dragAndDrop(ele7, ele8). perform();
	  
}
}
