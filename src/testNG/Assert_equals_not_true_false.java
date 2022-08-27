package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals_not_true_false {
@Test 
public void TC1() {
	Reporter.log("Running Test 1",true);
	String actR1="act";
	String expR1="act";
	assertEquals(actR1, expR1);
}
@Test
public void TC2() {
	Reporter.log("Running Test 2",true);
	String actR2="act";
	String expR2="acT";
	assertNotEquals(actR2,expR2);
}
@Test
public void TC3() {
	Reporter.log("Running Test 3",true);
	boolean actR=true;
	assertTrue(actR);
}
@Test
public void TC4() {
	Reporter.log("Running Test 4",true);
	boolean actR=false;
	assertFalse(actR);
}
}
