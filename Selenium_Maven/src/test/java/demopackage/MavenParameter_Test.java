package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameter_Test {
	@Test
	public void recieveData() {
		String url=System.getProperty("url");
		System.out.println(url);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.quit();
	}

}
