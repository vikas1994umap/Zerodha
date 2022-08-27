package pom_without_ddf;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLoginTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	Acti_BLC acti=new Acti_BLC(driver);
	acti.enterUN();
	acti.enterPWD();
	acti.clickLOGINBUTTON();
	
	ActiHOME_BLC home=new ActiHOME_BLC(driver);
	home.verifyACTIID();
	
	driver.close();
}
}
