package wait;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_DDF {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("E:\\Relative.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("reel");
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	//Implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).click();
	String un = sh.getRow(8).getCell(0).getStringCellValue();
	
	//Explicitly wait
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_email']")));
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(un);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	String pass = sh.getRow(8).getCell(1).getStringCellValue();
	
	// fluent wait
	FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
	fwait.withTimeout(Duration.ofSeconds(10));
	fwait.pollingEvery(Duration.ofSeconds(2));
	fwait.ignoring(NoSuchElementException.class);
	fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='userProfileLink username ']")));

	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	String expt = "John Doe";
	String act = driver.getTitle();
	if (expt.equals(act)) {
	System.out.println("TestCasePassed");
	} 
	else {
	System.out.println("TestCaseFailed");
	}
	
	
}

}
