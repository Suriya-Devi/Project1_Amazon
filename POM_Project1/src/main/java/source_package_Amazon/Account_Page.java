package source_package_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Page {
	boolean b1;
	@FindBy(xpath = "(//a[.='Edit'])[1]")
	WebElement name_edit;
	
	@FindBy(name ="customerName")
	WebElement change_profile_name;
	
	@FindBy(id = "cnep_1C_submit_button")
	WebElement save_changes_btn;
	
	@FindBy(id = "SUCCESS_MESSAGES")
	WebElement Name_updated_message;
	
		//2.Seperate methods for each component to perform its action
	public void Profile_name_edit() {
		name_edit.click();
	}
	
	public void name_change() {
		change_profile_name.clear();
		change_profile_name.sendKeys("Suriya R");
	}
	
	public void Save_Changes() {
		save_changes_btn.click();	
	}
	
	public boolean Successful_name_Message() {
		 b1 =Name_updated_message.isDisplayed();
		System.out.println(b1);
		return b1;
		
	}
	
	
		//3.Initialising the elements using PageFactory class inside the constructor
		public Account_Page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
}
