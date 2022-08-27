package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_Test_Case_class_level {
	@Test
    public void TC1() {
	    Reporter.log("Running TC1", true);
}
	@Test
	public void TC2() {
		Reporter.log("Running TC2", true);
	}
	@Test(enabled =true)
	public void TC3() {
		Reporter.log("Running TC3", false);
	}
}
