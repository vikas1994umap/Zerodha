package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div_group {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\\\chrome\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//button[text()='✕']"));
    Thread.sleep(4000);
    
}
}
