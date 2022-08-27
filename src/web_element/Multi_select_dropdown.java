package web_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_select_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("file:///C:/Users/admin/Desktop/Menu%20course.html");
		   WebElement dropdown = driver.findElement(By.xpath("//select[@id='Goodluck']"));
		   Select s =new Select(dropdown);
		   // Need to check whether the dropdown is multi selectable or not 
		   if(s.isMultiple()) {
			   System.out.println("D D is mlutiselectable");
		   }
		   else {
			   System.out.println("D D is not multiselectable");
		   }
		   //size of all options 
		   
		   List<WebElement> allelements = s.getOptions();
		   System.out.println(allelements.size());
		   
		   for(int i=0;i<=allelements.size()-1;i++) {
			   WebElement oneelement = allelements.get(i);
			   
			   String text = oneelement.getText();
			   System.out.println(text);
		   }
		   
		   
		   
		   }
	}
	
