
package test_package_Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
import source_package_Amazon.Search_Result_Page;
@Listeners(Listeners_Testng.class)
public class TestCase8_Sorting_Products extends Launch_and_Quit {
	//WebDriver driver;
	boolean p1;
	String price_check;
	String price;
	@Test
	public void Amazon_Product_Sorting() {
		
		Home_Page h1 = new Home_Page(driver);
		h1.Search_function();
		
		Search_Result_Page s1 = new Search_Result_Page(driver);
		s1.Dropdown_Featured();
		s1.Ratings_Customer_review();
		s1.Sorting_priceRange_list();
	/*	 public void Validate_priceRange() {
			   for(int i=0;i<5;i++) {
				  WebElement e1 = driver.findElement(By.xpath("//span[@class='a-price-whole'])["+i+"]"));
				 
				  price=e1.getText();
				String b=  (price.replace(",",""));
				System.out.println(b);
				
			
			// if() {}
			   
			   
			   }
*/
		//Assert.assertTrue(p1,"sry,not selected");
}
}