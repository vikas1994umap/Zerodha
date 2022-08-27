package framework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_ddf {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("E:\\Relative.xlsx");
		Sheet sh= WorkbookFactory.create(fis).getSheet("reel");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String UN = sh.getRow(9).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		
		String PWD = sh.getRow(9).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		String PIN = sh.getRow(9).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		String expID = sh.getRow(9).getCell(3).getStringCellValue();
		    String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		    if(actID.equals(expID)) {
		    	System.out.println("TC is pass");
		    }
		    else {
		    	System.out.println("TC is fail");
		    }
	}
}
