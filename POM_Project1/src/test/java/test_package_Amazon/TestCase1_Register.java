package test_package_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
import source_package_Amazon.Registration_Page;

public class TestCase1_Register extends Launch_and_Quit{
	//WebDriver driver;
	@Test
	public void Amazon_Register () throws InterruptedException {
		/*driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		
		Home_Page h1 = new Home_Page(driver);
		h1.Account_and_Lists(driver);
		h1.Start_here_Register();
		
		Registration_Page r1 = new Registration_Page(driver);
		r1.name();
		r1.phone_number();
		r1.password();
		r1.verify_btn();
		Thread.sleep(20000);
		//r1.start_puzzle();
		//Thread.sleep(10000);
		r1.mobile_otp();
		
		//Assert.assertTrue(otp_tf.isDisplayed(),"sry,test case fails");
		r1.create_your_Amazon_account();
		Assert.assertEquals(driver.getTitle(),"Amazon Phone Verification","Sry,not matching");
		
	}

}
