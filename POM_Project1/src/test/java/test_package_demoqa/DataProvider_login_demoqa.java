package test_package_demoqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_login_demoqa {

	@DataProvider(name = "data1")
	public Object[][] method(){
	Object[][] o1 =	new Object [3][2] ;
		o1[0][0]= "Suriya";
		o1[0][1]= "suriya@123";
		o1[1][0]= "Sudi";
		o1[1][1]= "sudi@456";
		o1[2][0]= "Hani";
		o1[2][1]= "Hani@345";
		return o1;
	}
	@Test(dataProvider="data1")
	public static void login(String username,String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement UN=driver.findElement(By.id("userName"));
			UN.sendKeys(username);
			
			WebElement Pwd=driver.findElement(By.id("password"));
			Pwd.sendKeys(password);
		driver.close();
			
	}
}
