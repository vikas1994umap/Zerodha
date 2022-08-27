package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_nxtgenaiacademy {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://nxtgenaiacademy.com/demo-site/");
	  JavascriptExecutor jse= (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,1500);");
	  driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys("vikas");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys("umap");
	  jse.executeScript("window.scrollBy(0,500);");
	 driver.findElement(By.xpath("(//span[@class='vfb-span'])[1]")).click();
	 driver.findElement(By.xpath("//input[@id='vfb-14']")).sendKeys("vikas1994umap@gmail.com");
	 
	 WebElement we1 = driver.findElement(By.xpath("//select[@id='vfb-16-hour']"));
	 Select s1=new Select(we1);
	 s1.selectByIndex(10);
	 
	 WebElement we2 = driver.findElement(By.xpath("//select[@id='vfb-16-min']"));
	 Select s2=new Select(we2);
	 s2.selectByIndex(10);
	 jse.executeScript("window.scrollBy(0,1500);");
	 driver.findElement(By.xpath("//input[@id='vfb-3']")).sendKeys("56");
	 driver.findElement(By.xpath("//input[@id='vfb-4']")).click();
	 
}
}
