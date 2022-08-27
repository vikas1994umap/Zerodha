package pom_kite_ddf;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("E:\\Relative.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("reel");
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		KiteLogin1Page login1=new KiteLogin1Page(driver) ;
		String UN1 = sh.getRow(9).getCell(0).getStringCellValue();
		login1.enterUN(UN1);
        String PWD1 = sh.getRow(9).getCell(1).getStringCellValue();
		login1.enterPWD(PWD1);
		
		login1.clickLOGINBUTTON();
		
		KitePIN PIN1=new KitePIN(driver);
		String PINV = sh.getRow(9).getCell(2).getStringCellValue();
		PIN1.enterPIN(PINV);
		PIN1.clickPINLOGINBUTTON();
		
		KiteHome home=new KiteHome(driver);
		String expID = sh.getRow(9).getCell(3).getStringCellValue();
   	    home.verifyUSERID(expID);
		
		
		driver.quit();
		
	}
}
