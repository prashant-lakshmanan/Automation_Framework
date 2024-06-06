package demopackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_Test {
	@Test
	public void display() {
		Reporter.log("First Demo Test",true);
		Reporter.log("Added in GitHub",true);
	}

}
