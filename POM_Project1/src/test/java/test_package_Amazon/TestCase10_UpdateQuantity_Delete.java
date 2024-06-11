package test_package_Amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import source_package_Amazon.Add_To_Cart_Page;
import source_package_Amazon.Home_Page;
import source_package_Amazon.PDP_Page;
import source_package_Amazon.Search_Result_Page;

public class TestCase10_UpdateQuantity_Delete extends Launch_and_Quit {
	
WebDriver driver;

@Test
public void Amazon_PDP_AddtoCart() {
	/*driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
	Home_Page h1 = new Home_Page(driver);
	h1.Search_function();
	
	Search_Result_Page s1 = new Search_Result_Page(driver);
	s1.Ratings_Customer_review();
	s1.Sorting_priceRange_list();
	s1.Selecting_first_product();
	//driver.switchTo().defaultContent();
	Set<String> s3= driver.getWindowHandles();
	Iterator<String> i1 =s3.iterator();
	String parent_window = i1.next();
	String child_window = i1.next();
	driver.switchTo().window(child_window);
	
	PDP_Page p1 = new PDP_Page(driver);
	p1.AddtoCart_PDP();
	
	Assert.assertEquals(driver.getTitle(),"Amazon.in Shopping Cart","sorry");
}
	@Test(dependsOnMethods = "Amazon_PDP_AddtoCart")
	public void Amazon_UpdateQuantity_Delete_fromCart() throws InterruptedException {
		Add_To_Cart_Page a1 = new Add_To_Cart_Page(driver);
		a1.go_to_cart();
		a1.updating_quantity();
		Thread.sleep(2000);
		a1.Deleting_fromCart();
	}
}
