package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags {
  @Test(invocationCount = 5)
public void testcase() {
	Reporter.log("running test case",true);
}
}
