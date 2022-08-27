package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo_guru99 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\\\chrome\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//input)[1]")).sendKeys("123452"); // enter customer id
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//input)[2]")).click(); // click on submit button
    
    
    Alert alt=driver.switchTo().alert();     //switch from main page to pop-up
    Thread.sleep(4000);
    //alt.accept();                 // click on ok button
    //Thread.sleep(4000);
    alt.dismiss();                // click on cancel button
    Thread.sleep(4000);
    String text = alt.getText();
    System.out.println(text);
    
   
    driver.quit();
}
}
