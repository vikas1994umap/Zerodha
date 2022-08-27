package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_gmail {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	   driver.findElement(By.xpath("(//input)[1]")).sendKeys("vikas1994umap");
	   driver.findElement(By.xpath("(//span)[8]")).click();
	   driver.findElement(By.xpath("(//input)[3]")).sendKeys("vikas@1994");
	   driver.findElement(By.xpath("(//span)[9]")).click();
	   
	   
}
}
