package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Verify {
@Test
public void TC1() {
Reporter.log("Running tc1",true);
String expR="Hi";
String actR="Hello";

SoftAssert soft=new SoftAssert();
soft.assertEquals(expR, actR);
System.out.println("I know after failed");

}
@Test
public void TC2() {
Reporter.log("Running tc2",true);
}
}
