package test_package_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.Add_To_Cart_Page;
import source_package_Amazon.CheckOut_Page;
import source_package_Amazon.Home_Page;
import source_package_Amazon.Login_Page;
import source_package_Amazon.PDP_Page;
import source_package_Amazon.Search_Result_Page;
@Listeners(Listeners_Testng.class)
public class TestCase12_Select_EachPaymentMethod extends Launch_and_Quit{
	@Test(retryAnalyzer=test_package_Amazon.RetryLogic_Project1.class)
	public void Amazon_Checkout_validation() throws InterruptedException {
		/*driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		*/
		Home_Page h1 = new Home_Page(driver);
		h1.Account_and_Lists(driver);
		h1.signin();
		Login_Page l1 = new Login_Page(driver);
		l1.email();
		l1.cnt();
		l1.password();
		l1.sign_in_login();
		
		h1.Search_function();
		
		Search_Result_Page s1 = new Search_Result_Page(driver);
		s1.Ratings_Customer_review();
	//	s1.Sorting_priceRange_list();
		s1.Selecting_first_product();
		//driver.switchTo().defaultContent();
		Set<String> s3= driver.getWindowHandles();
		Iterator<String> i1 =s3.iterator();
		String parent_window = i1.next();
		String child_window = i1.next();
		driver.switchTo().window(child_window);
		
		PDP_Page p1 = new PDP_Page(driver);
		p1.AddtoCart_PDP();
		
		Add_To_Cart_Page c1 = new Add_To_Cart_Page(driver);
		c1.proceed_to_checkout();
		
		CheckOut_Page c2 = new CheckOut_Page(driver);
	//	Thread.sleep(2000);
		//c2.New_Address();
		//c2.Delivery_address_change();
		Thread.sleep(2000);
		c2.Use_Address();
		Assert.assertFalse(c2.payment_method_COD(), "Sry,not selected");
		
		Thread.sleep(2000);
		
	//	c2.Use_Payment();
		
		
	}
}
