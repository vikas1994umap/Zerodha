package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Running_Browser_A {
    @Test
	public void TC1() {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com/");
	}
}
