package source_package_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page {
	WebDriver driver;

	//1.Finding the element using @findBy annotation
	
	@FindBy(id = "ap_customer_name")
	WebElement name_tf;
	
	@FindBy(id = "ap_phone_number")
	WebElement phone_number_tf;
	
	@FindBy(id = "ap_password")
	WebElement password_tf;
	
	@FindBy(id = "continue")
	WebElement verify_mobile_btn;
	//button[.='Start Puzzle']
	@FindBy(xpath = "//button[@class='sc-nkuzb1-0 sc-d5trka-0 eZxMRy button']")
	WebElement start_puzzle_btn;
	
	@FindBy(name = "code")
	WebElement otp_tf;
	
	@FindBy(id = "auth-verify-button")
	WebElement create_amozon_btn;
	
	
	
	//2.Seperate methods for each component to perform its action
	
	public void name() {
		name_tf.sendKeys("Sudiksha");
		}
	public void phone_number() {
		phone_number_tf.sendKeys("9456734569");
	}
	
	public void password() {
		password_tf.sendKeys("Sudikuty@123");
	}
	
	public void verify_btn() {
		verify_mobile_btn.click();
	}
	
	public void start_puzzle() {
		start_puzzle_btn.click();
	}
	
	public void mobile_otp() {
		otp_tf.sendKeys("345678");
	}
	
	
	public void create_your_Amazon_account() {
		create_amozon_btn.click();
	}
	
	//3.Initialising the elements using PageFactory class inside the constructor
	
	public Registration_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
}
