package source_package_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends DataDrivenTest_Login{
//	WebDriver driver;
	
	//a) Finding the element using @FindBy annotaion
		@FindBy(name = "email")
		WebElement email_tf;
		
		@FindBy(id = "continue")
		WebElement continue_button;
		
		@FindBy(id = "ap_password")
		WebElement password_tf;
		
		@FindBy(id = "signInSubmit")
		WebElement sign_in_button;
		
		//b) Seperate methods for each component to perform its action
		public void email()
		{
			email_tf.sendKeys(username);	}
		
		public void cnt() 
		{
			continue_button.click();
		}
		
		public void password()
		{
			password_tf.sendKeys(password);
		}
		public void sign_in_login() 
		{
			sign_in_button.click();
		}
		
		public Login_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
}
