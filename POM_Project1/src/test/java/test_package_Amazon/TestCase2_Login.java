package test_package_Amazon;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.DataDrivenTest_Login;
import source_package_Amazon.Home_Page;
import source_package_Amazon.Login_Page;
@Listeners(Listeners_Testng.class)
public class TestCase2_Login extends Launch_and_Quit {
//WebDriver driver;
	
	@Test
	public void Login_ValidCredentials() throws InterruptedException, EncryptedDocumentException, IOException {
	/*	driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		*/
		
		Home_Page h1 = new Home_Page(driver);
		h1.Account_and_Lists(driver);
		h1.signin();
		DataDrivenTest_Login.main();
		Login_Page l1 = new Login_Page(driver);
		Thread.sleep(2000);
		l1.email();
		l1.cnt();
		l1.password();
		l1.sign_in_login();
		
		Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sry,not matching");
	}
}
