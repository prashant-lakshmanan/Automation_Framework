package demopackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1_Test {
	@Test
	public void display() {
		Reporter.log("Second Demo Test",true);
	}

}
