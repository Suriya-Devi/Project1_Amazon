package test_package_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
@Listeners(Listeners_Testng.class)
public class TestCase5_Searching extends Launch_and_Quit {

	//WebDriver driver;
	@Test
	public void Search_product() {
	/*	driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		*/
		Home_Page h1 = new Home_Page(driver);
		h1.Search_function();
		
		Assert.assertEquals(driver.getTitle(),"Amazon.in : shoe","Sorry,dont match");
}
}