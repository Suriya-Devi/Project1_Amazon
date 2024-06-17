package test_package_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
import source_package_Amazon.Login_Page;
@Listeners(Listeners_Testng.class)
public class TestCase3_Login_Invalid extends Launch_and_Quit{

//	WebDriver driver;
	@Test
	public void Login_InValidCredentials() {
		
		
		Home_Page h1 = new Home_Page(driver);
		h1.Account_and_Lists(driver);
		h1.signin();
		
		Login_Page l1 = new Login_Page(driver);
		l1.email();
		l1.cnt();
		l1.password();
		l1.sign_in_login();
		
		Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sry,not matching");
	}
	
}
