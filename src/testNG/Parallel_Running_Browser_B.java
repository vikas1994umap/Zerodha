package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Running_Browser_B {
	@Test
	public void TC2() {
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
}
}