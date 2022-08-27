package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class Screenshot_Google {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	    TakesScreenshot ts=(TakesScreenshot )driver;
	    File srcc = ts.getScreenshotAs(OutputType.FILE);
	    
	    File destt = new File("C:\\Users\\admin\\Desktop\\Manual T\\amazon.png");
	    Files.copy(srcc, destt);
	    
	    
	    
	    
	    
	}
	
}
