package test_package_Amazon;



import java.io.File;
//	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
	
	public class Launch_and_Quit extends Listeners_Testng {
	// WebDriver driver;
		
		@BeforeMethod
		@Parameters("browser")
		public  void launch(String browsername) {
		if(browsername.equals("chrome")) {
				driver = new ChromeDriver();
				
		}
			if(browsername.equals("firefox")) {
				driver = new FirefoxDriver();
			}
			
			if(browsername.equals("edge")) {
				driver = new EdgeDriver();
			}
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
		}
		
		@AfterMethod
		public  void Quit() throws IOException {
			
			driver.quit();
		}

}
