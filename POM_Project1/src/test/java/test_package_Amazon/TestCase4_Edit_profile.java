package test_package_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import source_package_Amazon.Account_Page;
import source_package_Amazon.Home_Page;
import source_package_Amazon.Login_Page;
@Listeners(Listeners_Testng.class)
public class TestCase4_Edit_profile extends Launch_and_Quit{
	//WebDriver driver;
	@Test
	public void Amazon_Profile_edit() throws InterruptedException {
	/*	driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		*/
		Home_Page h1 = new Home_Page(driver);
		h1.Account_and_Lists(driver);
		h1.your_Account();
		h1.login_Security();
		//h1.signin();
		
		Login_Page l1 = new Login_Page(driver);
		l1.email();
		l1.cnt();
		l1.password();
		l1.sign_in_login();
		Thread.sleep(10000);
		
	Assert.assertEquals(driver.getTitle(), "Login and Security","Sry,not matching");
		Account_Page a1 = new Account_Page(driver);
		
		a1.Profile_name_edit();
		a1.name_change();
		a1.Save_Changes();
		//a1.Successful_name_Message(true);
		
		Assert.assertTrue(a1.Successful_name_Message(),"Sorry");
	}

}
