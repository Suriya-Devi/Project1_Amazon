package test_package_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
//import source_package_Amazon.Launch_Quit;
import source_package_Amazon.Search_Result_Page;
@Listeners(Listeners_Testng.class)
public class TestCase6_Searching_with_Filters extends Launch_and_Quit
{
	//WebDriver driver;
	@Test
	public void Amazon_Search_and_Filter() {
		/*driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		Home_Page h1 = new Home_Page(driver);
		h1.Search_function();
		
		Search_Result_Page s1 = new Search_Result_Page(driver);
		s1.Sorting_category_list();
		s1.Sorting_priceRange_list();
		
		s1.Selecting_first_product();
		
		
		
	}

}
