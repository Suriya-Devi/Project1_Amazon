package test_package_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
import source_package_Amazon.PDP_Page;
import source_package_Amazon.Search_Result_Page;
@Listeners(Listeners_Testng.class)
public class TestCase7_PDP_check extends Launch_and_Quit{
	//WebDriver driver;
     @Test(retryAnalyzer=test_package_Amazon.RetryLogic_Project1.class)
     public void PDP_validate_Price_Des_Reviews() throws InterruptedException {
    	 
    		
 		Home_Page h1 = new Home_Page(driver); 
 		h1.Search_function();
 		
 		Search_Result_Page s1 = new Search_Result_Page(driver);
 		
 		s1.Ratings_Customer_review();
 		//s1.Sorting_priceRange_list();
 		Thread.sleep(2000);
 		s1.Lower_Slide_Price_Range(driver);
 		Thread.sleep(2000);
 		s1.button_Go();
 		Thread.sleep(3000);
 		
 		/*s1.Selecting_first_product();
 		
 		PDP_Page p1 = new PDP_Page(driver);
 		
 		Reporter.log("price of the product is "+p1.Price_of_the_Product());
 		
 		*/
     }
}
