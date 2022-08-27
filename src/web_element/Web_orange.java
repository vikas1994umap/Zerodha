package web_element;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_orange {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		   driver.findElement(By.xpath("(//input)[6]")).sendKeys("Admin"); //Enter UN
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("(//input)[7]")).sendKeys("admin123"); // Enter PWD
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("(//input)[8]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("(//b)[1]")).click();
		   Thread.sleep(5000);
		   WebElement dropdown=driver.findElement(By.xpath("(//select)[1]"));
		   Select s = new Select(dropdown);
		  //s.selectByIndex(1);	   
		  s.selectByVisibleText("ESS");
}
}
