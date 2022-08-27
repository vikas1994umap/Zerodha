package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Screenshot_loksatta {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.loksatta.com/");
	String random = RandomString.make();
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\admin\\Desktop\\Manual T\\"+random+".png");
	Files.copy(src, dest); 
}
}
