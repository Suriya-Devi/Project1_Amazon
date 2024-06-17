package test_package_Amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
import source_package_Amazon.PDP_Page;
import source_package_Amazon.Search_Result_Page;
@Listeners(Listeners_Testng.class)
public class TestCase15_Reach_CartPage_without_Login extends Launch_and_Quit{
//WebDriver driver;
	@Test(retryAnalyzer=test_package_Amazon.RetryLogic_Project1.class)
	public void Add_To_CartPage_without_Login() {
		
		Home_Page h1 = new Home_Page(driver); 
		h1.Search_function();
		
		Search_Result_Page s1 = new Search_Result_Page(driver);
		s1.Selecting_first_product();
		Set<String> s3= driver.getWindowHandles();
		Iterator<String> i1 =s3.iterator();
		String parent_window = i1.next();
		String child_window = i1.next();
		driver.switchTo().window(child_window);
		
		PDP_Page p1 = new PDP_Page(driver);
		p1.AddtoCart_PDP();
		
		
	}
}
