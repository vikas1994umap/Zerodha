package pom_DDF_Testng;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class KiteLoginTEST_Testng {
	//variables Declare Globally
	Sheet sh;
	WebDriver driver;
	KiteLogin1Page_Testng login1;
	KiteHome_TestNG home;
	KitePIN_Testng PIN1;
	
@BeforeClass
	public void OpenBrowser() throws Throwable {
		
		FileInputStream fis = new FileInputStream("E:\\Relative.xlsx");
		sh = WorkbookFactory.create(fis).getSheet("reel");
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		login1=new KiteLogin1Page_Testng(driver) ;
		PIN1=new KitePIN_Testng(driver);
		home=new KiteHome_TestNG(driver);
}
@BeforeMethod
		public void loginToApp() {
		String UN1 = sh.getRow(9).getCell(0).getStringCellValue();
		login1.enterUN(UN1);
        String PWD1 = sh.getRow(9).getCell(1).getStringCellValue();
		login1.enterPWD(PWD1);
		
		login1.clickLOGINBUTTON();
	
		String PINV = sh.getRow(9).getCell(2).getStringCellValue();
		PIN1.enterPIN(PINV);
		PIN1.clickPINLOGINBUTTON();
}		
@Test
        public void verifyUSERID() {
	    Reporter.log("Running verify USERID ",true);
		String expID = sh.getRow(9).getCell(3).getStringCellValue();
   	    String actID = home.verifyUSERID();
   	    Assert.assertEquals(expID,actID,"Both diff case is failed");
   	   
}		
@AfterMethod
        public void logout() {
	    Reporter.log("logout the application",true);
}
@AfterClass
        public void closeBrowser() {
		Reporter.log("close the app",true);
		
	}
}
