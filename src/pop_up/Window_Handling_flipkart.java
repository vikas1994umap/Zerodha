package pop_up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling_flipkart {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");       // enter the URL
		driver.findElement(By.xpath("//button[text()='✕']")).click();     //click on cancel button
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("glasses"); //enter text in search bar
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();   //click on search icon
		Thread.sleep(3000);
		  // click on child webpage text
		 driver.findElement(By.xpath("(//div[@class='_2B099V'])[1]")).click();
		 Thread.sleep(3000);
		 Set<String> allws = driver.getWindowHandles();
		    for(String singlewin:allws) {
		    	driver.switchTo().window(singlewin);//now ur selenium control goes from main win to child
		    }
		    //get the text of child for our confirmation
		    Thread.sleep(3000);
		    String expT="Riding Glasses, UV Protection, Others Aviator Sunglasses (55)  (For Men & Women, Green)";
		    String actT = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		    System.out.println(actT);
		    //verify the child window handle or not
		    Thread.sleep(3000);
		    if(actT.equals(expT)) {
		    	System.out.println("child window is handles and TC is pass");
		    }
		    else {
		    	System.out.println("Tc is fail");
		    }
		
	}
   
}
