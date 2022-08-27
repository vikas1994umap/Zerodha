package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 4)
public void tc1() {
	Reporter.log("Good night", true);
}
@Test(priority=-2)
public void tc2() {
	Reporter.log("Good morning", true);
}
@Test(priority = 4)
public void tc3() {
	Reporter.log("Good evening", true);
}
@Test
public void tc4() {
	Reporter.log("Good afternoon", true);
}


}
