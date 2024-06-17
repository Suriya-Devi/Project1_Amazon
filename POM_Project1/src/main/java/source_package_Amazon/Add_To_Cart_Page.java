package source_package_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_To_Cart_Page {
WebDriver driver;	
	@FindBy(xpath = "(//a[@class='a-button-text'])[3]")
	WebElement Go_to_Cart_btn;
	
	@FindBy(id = "quantity")
	WebElement item_quantity;
	
	@FindBy(css = "input[value='Delete']")
	WebElement delete_btn;
	//(//input[@class='a-color-link'])[1] - not working
	//(//span[@class='a-declarative'])[9] - not working-staleElement Reference Exception
	
	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceed_to_buy_btn;
	
	public void go_to_cart() {
		Go_to_Cart_btn.click();
	}
	
	public void updating_quantity() {
		Select s2 = new Select(item_quantity);
		s2.selectByValue("2");
	}
	
	public void Deleting_fromCart() {
		delete_btn.click();
	}
	
	public void proceed_to_checkout() {
		proceed_to_buy_btn.click();
	}
	
	//3.Initialising the elements using PageFactory class inside the constructor
	
		public Add_To_Cart_Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
}
