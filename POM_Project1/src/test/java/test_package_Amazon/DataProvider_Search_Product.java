package test_package_Amazon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source_package_Amazon.Home_Page;
@Listeners(Listeners_Testng.class)
public class DataProvider_Search_Product extends Launch_and_Quit{

	@DataProvider(name = "data1")
	public Object[][] search(){
		return new Object[][] {
			{"shoes"},{"mobiles"}
			//,{"watches"}
		};
		
	}
	
	@Test(dataProvider = "data1")
	public void Search_multiple_Logins(String search) {
		Home_Page h1 = new Home_Page(driver);
		h1.Search_function(search);
	}
}
 