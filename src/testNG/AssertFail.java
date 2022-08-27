package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
@Test
public void TC1() {
	Reporter.log("Running tc1",true);
	Assert.fail();
	System.out.println("I know after failed");
	
}
@Test
public void TC2() {
	Reporter.log("Running tc2",true);
}
}