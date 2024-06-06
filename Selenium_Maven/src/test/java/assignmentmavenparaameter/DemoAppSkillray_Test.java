package assignmentmavenparaameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAppSkillray_Test {
	@Test
	public void login() {
		String url=System.getProperty("url");
		String userName = System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println(userName);
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("last")).click();
		
	}

}
