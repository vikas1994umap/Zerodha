package pop_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	
	ChromeOptions c=new ChromeOptions(); //create object of browser setting class
	
	c.addArguments("--disable-notifications"); //call addArgument method of browser setting class
	
    WebDriver driver=new ChromeDriver(c);  //pass ref variable in chromedriver constructor
    driver.get("https://www.hdfc.com");
}
}

