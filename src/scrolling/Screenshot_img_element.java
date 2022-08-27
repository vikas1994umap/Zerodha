package scrolling;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_img_element {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    //i want to take screenshot of particular element(inspect element store in ref variable)
	    WebElement gTitle = driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']"));
	    File src = gTitle.getScreenshotAs(OutputType.FILE);
	    //store at destination
	    File dest=new File("C:\\Users\\admin\\Desktop\\Manual T\\flipkartimg.jpg");
	    //source to destination
	    Files.copy(src, dest);
	    
	}
}
