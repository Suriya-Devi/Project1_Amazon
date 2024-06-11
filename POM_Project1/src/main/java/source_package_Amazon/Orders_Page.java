package source_package_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders_Page {
	WebDriver driver;
	
	@FindBy(xpath = "//span[@id='a-autoid-9']")
	WebElement product_review_btn;
	
	@FindBy(xpath = "(//button[@class='ryp__star__button'])[4]")
	WebElement product_star_ratings;
	
	@FindBy(xpath= "//span[.='Clear']")
	WebElement clear_link;
	
	@FindBy(xpath = "//span[.='Submitted']")
	WebElement submitted_link;
	
	public void Write_Product_Review() {
		product_review_btn.click();
	}
	
	public void Star_Ratings_Review() {
		product_star_ratings.click();
	}
	
	public void clear_review() {
		clear_link.click();
	}
	
	public void Submitted_review() {
		submitted_link.isDisplayed();
	}
	
	public Orders_Page(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
}


