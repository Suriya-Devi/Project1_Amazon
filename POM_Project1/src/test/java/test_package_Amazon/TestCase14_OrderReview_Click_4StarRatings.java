package test_package_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
import source_package_Amazon.Login_Page;
import source_package_Amazon.Orders_Page;

public class TestCase14_OrderReview_Click_4StarRatings {
	WebDriver driver;
	@Test
	public void orderReview_4star_Ratings() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Home_Page h1 = new Home_Page(driver);
		//h1.Account_and_Lists(driver);
	//	h1.Your_Orders();
		h1.Returns_Orders();
		
		Login_Page l1 = new Login_Page(driver);
		l1.email();
		//l1.cnt();
		l1.password();
		l1.sign_in_login();
		
		Orders_Page o1 = new Orders_Page(driver);
		o1.Write_Product_Review();
		o1.Star_Ratings_Review();
			Thread.sleep(2000);
		o1.clear_review();	
		
		
		
	}

}
