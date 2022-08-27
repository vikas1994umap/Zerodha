package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo_nextgenacademy_Alertbox {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\\\chrome\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("//button[text()='Alert Box']")).click(); //click on alert Box
    Alert alt=driver.switchTo().alert();
    alt.accept();                // click on submit button 
    Thread.sleep(8000);
   // String text = alt.getText();
   // System.out.println(text);
   
    driver.quit();
}
}
