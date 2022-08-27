package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	
@BeforeClass	
public void openbrowser() {
	Reporter.log("open browser",true);
}
@BeforeMethod
public void loginApp() {
	Reporter.log("login",true);
}
@Test
public void verifyID() {
	Reporter.log("login",true);
}
@AfterMethod
public void logoutApp() {
	Reporter.log("login",true);
}

}
