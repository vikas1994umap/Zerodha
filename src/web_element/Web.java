package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/admin/Desktop/good.html");
	   WebElement dropdown= driver.findElement(By.xpath("//select[@id='Goodluck']"));
	   Select s=new Select(dropdown);
	   //s.selectByIndex(9);
	  //s.selectByValue("c");
	  s.selectByVisibleText("samosa");
	  driver.quit();
	  
}
}
