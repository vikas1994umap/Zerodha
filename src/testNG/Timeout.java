package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
@Test(timeOut = 4000)

public void tc() {
	Reporter.log("Aaram ke sath",true);
}
}
