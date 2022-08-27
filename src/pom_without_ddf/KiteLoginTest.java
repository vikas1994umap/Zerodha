package pom_without_ddf;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	KiteLoginPage1 login1=new KiteLoginPage1(driver) ;
	login1.enterUN();
	login1.enterPWD();
	login1.clickLOGINBUTTON();
	
	KitePIN_BLC PIN1=new KitePIN_BLC(driver);
	PIN1.enterPIN();
	PIN1.clickPINLOGINBUTTON();
	
	KiteHome_BLC home=new KiteHome_BLC(driver);
	home.verifyUSERID();
	
	
	driver.quit();
	
}
}
