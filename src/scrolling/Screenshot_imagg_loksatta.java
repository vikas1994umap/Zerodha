package scrolling;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_imagg_loksatta {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.loksatta.com/");
	    //i want to take screenshot of particular element(inspect element store in ref variable)
	    WebElement gTitle = driver.findElement(By.xpath("//img[@class='logo skip-lazy']"));
	    File src = gTitle.getScreenshotAs(OutputType.FILE);
	    //store at destination
	    File dest=new File("C:\\Users\\admin\\Desktop\\Manual T\\loksattaimg.jpg");
	    //source to destination
	    Files.copy(src, dest);
	    
	}
}
