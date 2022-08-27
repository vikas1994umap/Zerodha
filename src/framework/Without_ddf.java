package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_ddf {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
    driver.findElement(By.xpath("//button[text()='Login ']")).click();
    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
    driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	
    String expID="DPG458";
    String actID=driver.findElement(By.xpath("//span[@class='user-id']")).getText();
    if(expID.equals(actID)) {
    	System.out.println("Both are same,TC is pass");
    }
    else {
    	System.out.println("Both are not same,TC is fail");
    }
    	
	
}
}
