package source_package_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDP_Page {
WebDriver driver;
//id = "submit.add-to-cart"
	@FindBy(xpath = "(//a[@class='a-button-text'])[1]")
	WebElement add_to_cart_btn;
	
	@FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
	WebElement product_price;
	
	public void AddtoCart_PDP() {
		add_to_cart_btn.click();
	}
	
	public String Price_of_the_Product() {
		return product_price.getText();
	}
	
	public PDP_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
