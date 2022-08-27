package web_element;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_selenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\\\chrome\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
    Thread.sleep(4000);
    
    driver.manage().window().maximize();
    driver.switchTo().frame("packageListFrame");
    String text1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
    System.out.println(text1);
    
    driver.switchTo().defaultContent();
    driver.switchTo().frame("packageFrame");
    String text2 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
    System.out.println(text2);
      
     driver.switchTo().defaultContent();
     driver.switchTo().frame("classFrame");
     String text3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
     System.out.println(text3); 
    
}
}
