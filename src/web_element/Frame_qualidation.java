package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_qualidation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://qavalidation.com/demoiframe/");
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12000));
	driver.manage().window().maximize();
	
	driver.switchTo().frame("Frame1");
	String f1 = driver.findElement(By.xpath("//a[text()='SignUp Form']")).getText();
	System.out.println(f1);
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame("Frame2");
	String f2 = driver.findElement(By.xpath("//a[text()='Tutorials!']")).getText();
	System.out.println(f2);
	
	
	
	
	
	
}
}
