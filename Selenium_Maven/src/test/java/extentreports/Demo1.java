package extentreports;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo1 {
	@Test
	public void fbLogin() {
		String TIME = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		String fbScreenshot = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/fbLoginPageScreenshot"+TIME+".html");
		ExtentReports exReport=new ExtentReports();
		exReport.attachReporter(spark);
		ExtentTest test = exReport.createTest("fbLogin");
		test.log(Status.INFO, "Adding fb login screenshot");
		test.addScreenCaptureFromBase64String(fbScreenshot, "Error message");
		exReport.flush();
		
	}

}
