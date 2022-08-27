package pom_ACTI_DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLoginTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream("E:\\Relative.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("reel");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		ActiLoginPage acti=new ActiLoginPage(driver);
		
	    String User = sh.getRow(8).getCell(0).getStringCellValue();
		acti.enterUN1(User);
		String Pass = sh.getRow(8).getCell(1).getStringCellValue();
		acti.enterPWD1(Pass);
		
		acti.clickLOGINBUTTON();
		
		ActiHome home=new ActiHome(driver);
		String expID = sh.getRow(8).getCell(2).getStringCellValue();
		home.verifyACTIID(expID);
		
		driver.close();
	}
}
