package web_element;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicsodDD {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laugh");
	   Thread.sleep(3000);
	   List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='YacQv gsfi']/span"));
	   for(WebElement oneoption:alloptions) {
		   String text = oneoption.getText();
		   System.out.println(text);
		   Thread.sleep(3000);
	   if(text.contains(" laughing emoji ")) {
		   oneoption.click();
				   break; 
	   }
	   
}
}
}