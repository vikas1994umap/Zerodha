package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browser {
	@Parameters("browsername")//annotation
	@Test
	public void TC(String browsername) {//parameterized method
			WebDriver driver=null;//due to runtime polymorphism
		
		if(browsername.equals("Edge")) {
		   System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
		   driver=new EdgeDriver(); 
		}
		else if(browsername.equals("Chrome")) {
		   System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		   driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		driver.get("https://amazon.com/");
			
}
}