package surefirewebpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_Test {
	@Test(groups = "system")
	public void display() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("DemoWebShop launched",true);
	}

}
