package source_package_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Page {
WebDriver driver;	


    @FindBy(xpath = "//div[@class='a-row address-row']")
    WebElement new_address_radiobtn;

	@FindBy(xpath = "(//input[@class='a-button-input'])[2]")
	WebElement use_this_address_btn;
	
	@FindBy(xpath = "(//div[@class='a-box-inner a-padding-small'])[2]")
	WebElement CC_Payment_btn;
	
	//(//span[.='Amazon accepts all major credit &  cards'])[1]
	@FindBy(xpath = "(//span[.='Amazon accepts all major credit &  cards'])[1]")
	WebElement CC_text_message;
	
	@FindBy(xpath = "(//div[@class='a-box-inner a-padding-small'])[6]")
	WebElement COD_Payment_btn;
	
	@FindBy(xpath = "(//span[.='Use this payment method'])[2]")
	WebElement use_this_payment_btn;
	
	@FindBy(xpath = "(//span[@class='a-declarative'])[5]")
	WebElement delivery_address_link;
	
	@FindBy(name = "ppw-claimCode")
	WebElement Coupon_Code_tf;
	
	@FindBy(xpath = "//span[.='Apply']")
	WebElement apply_btn;
	
	@FindBy(xpath = "(//div[@class='a-alert-content'])[2]")
	WebElement message_invalid_code;
	
	public void Delivery_address_change() {
		delivery_address_link.click();
	}
	public void New_Address() {
		new_address_radiobtn.click();
	}
	public void Use_Address() {
		use_this_address_btn.click();
	}
	
	public void payment_method_CC() {
		CC_Payment_btn.click();
	}
	
	public boolean message_CC() {
		boolean message =CC_text_message.isDisplayed();
		return message;
	}
	
	public boolean payment_method_COD() {
		COD_Payment_btn.click();
		boolean cod =COD_Payment_btn.isSelected();
		return cod;
	}
	
	public boolean Invalid_Coupon_Code_message() {
		boolean message_coupon =message_invalid_code.isDisplayed();
		return message_coupon;
	}
	public void Use_Payment() {
		use_this_payment_btn.click();
	}
	
	public void CouponCode() {
		Coupon_Code_tf.sendKeys("HAP2024");
	}
	
	public void Apply_CouponCode() {
		apply_btn.click();
	}

	//3.Initialising the elements using PageFactory Class inside the constructor
	public CheckOut_Page(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
}
