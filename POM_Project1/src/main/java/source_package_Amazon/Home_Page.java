package source_package_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class Home_Page {
WebDriver driver;
	//1.Finding the element using @findBy annotation
	
	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement account_and_list_link;
	
	@FindBy(xpath = "//a[.='Start here.']")
	WebElement start_here_link;
	
	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement signin_link;
	
	
	@FindBy(xpath="//span[.='Your Account']")
	WebElement Account_link;
	
	@FindBy(xpath="(//span[@class='a-color-secondary'])[2]")
	WebElement Login_and_Security_link;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement search_txt_field;
	
	@FindBy(xpath = "//span[.='Your Orders']")
	WebElement your_orders_link;
	
	@FindBy(id = "nav-orders")
	WebElement Returns_and_Orders_link;
	
		//2.Seperate methods for each component to perform its action
	public void Account_and_Lists(WebDriver driver) 
	{
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(account_and_list_link).perform();
	}
	
	public void Start_here_Register()
	{
		start_here_link.click();
	}
		
		
	public void signin() {
		signin_link.click();
	}
	
	public void your_Account() {
		Account_link.click();
	}
	
	public void login_Security(){
		Login_and_Security_link.click();
	}
	@DataProvider(name = "data1")
	public void Search_function(String search) {
		
		search_txt_field.sendKeys(search);
		
		search_txt_field.sendKeys(Keys.ENTER);
	}
	
	public void Search_function() {
		search_txt_field.sendKeys("girls shoe 6-7 years");
	}
	
	public void Your_Orders() {
		your_orders_link.click();
	}

	public void Returns_Orders() {
		Returns_and_Orders_link.click();
		}
	
		//3.Initialising the elements using PageFactory class inside the constructor
		public Home_Page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
}
