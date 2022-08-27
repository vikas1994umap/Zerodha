package web_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_element_handling {
public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//button[text()='✕']")).click();
    Thread.sleep(4000);
	List<WebElement> ele = driver.findElements(By.xpath("//div"));
	Thread.sleep(4000);
	for(WebElement i:ele) {
	String str=i.getText();
    System.out.println(str);
			
			
		}
		
		 
	}
}

