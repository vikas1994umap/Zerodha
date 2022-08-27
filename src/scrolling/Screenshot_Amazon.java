package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_Amazon {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    //type cast take screenshot interface
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    //use getscreenshotAs()
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    //we have to store screenshot at particular dwstinTION create object of file class
	    File dest=new File("C:\\Users\\admin\\Desktop\\Manual T\\amazon.png");
	    //u have to transfer file source to destination
	    Files.copy(src, dest);
	    
	}
	}

