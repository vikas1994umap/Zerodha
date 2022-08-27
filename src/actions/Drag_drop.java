package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		  //inspect first element and store in Element1
		  WebElement Element1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		  //inspect element 2 and store in Element2
		  WebElement Element2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		  //object of Actions class
		  Actions act=new Actions(driver);
		  act.dragAndDrop(Element1, Element2).perform();
		  
		  
	}
}
