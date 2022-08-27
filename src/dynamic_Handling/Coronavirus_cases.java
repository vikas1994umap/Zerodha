package dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coronavirus_cases {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.worldometers.info/coronavirus/");
	  driver.manage().window().maximize();
	  String cases = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();
      System.out.println("Coronavirus Cases="+cases);
	  
      String Deaths = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[2]")).getText();
      System.out.println("Deaths="+Deaths);
      Thread.sleep(4000);
      driver.findElement(By.xpath("//div[@class='panel_clickable panel-heading']")).click();
      Thread.sleep(4000);
      String Active = driver.findElement(By.xpath("(//div[@class='panel_front']//div)[1]")).getText();
      System.out.println("Active Cases="+Active);
      
      String mild = driver.findElement(By.xpath("(//div[@style='float:left; text-align:center']//span)[1]")).getText();
      System.out.println("Active Cases in mild condition="+mild);
      
      String series = driver.findElement(By.xpath("(//div[@style='float:right; text-align:center']//span)[1]")).getText();
      System.out.println("Active Cases in series condition="+series);
      
      String closed = driver.findElement(By.xpath("(//div[@class='panel_front']//div)[8]")).getText();
      System.out.println("Closed Cases="+closed);
      
      String recover = driver.findElement(By.xpath("(//div[@style='float:left; text-align:center']//span)[2]")).getText();
      System.out.println("Recovered Cases="+recover);
      Thread.sleep(4000);
      String deaths = driver.findElement(By.xpath("(//div[@style='float:right; text-align:center']//span)[2]")).getText();
      System.out.println("Active Cases in mild condition="+deaths);
      
      
      
}

}
