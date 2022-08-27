package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  Reporter.log("hello");
  }
}

