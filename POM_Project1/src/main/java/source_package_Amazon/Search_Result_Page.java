package source_package_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Result_Page  {
	boolean p1;
WebDriver driver;
	//1.Finding the elements by @FindBy annotation
   @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
   WebElement first_product;
   //(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]
   @FindBy(xpath = "(//a[@class='a-link-normal s-navigation-item'])[12]")
   WebElement category_sort;
   
   @FindBy(xpath = "//select[@id='s-result-sort-select']")
   WebElement sort_relevance_dropdown;
   
   @FindBy(xpath = "//span[.='₹1,000 - ₹2,500']")
   WebElement price_sort;
   
   @FindBy(id = "p_36/range-slider_slider-item_lower-bound-slider")
   WebElement price_slider_lower;
   
   @FindBy(xpath = "(//input[@class='a-button-input'])[3]")
   WebElement go_btn;
   
   @FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
   WebElement customer_ratings;
   
  // @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
   //girls shoe 6-7 years
   @FindBy(xpath = "//div[@class='left-pane-results-container']/div/div")
   WebElement autosuggestion_list;
   //2.Seperate methods for each component to perform its action
   public void Sorting_category_list() {
	   category_sort.click();
   }
   
   public void Dropdown_Featured() {
	   Select sc = new Select(sort_relevance_dropdown);
	   sc.selectByVisibleText("Newest Arrivals");
	   
   }
   public boolean Sorting_priceRange_list() {
	   price_sort.click();
	    p1 =price_sort.isDisplayed();
	return p1;
   }
   
   public void Lower_Slide_Price_Range(WebDriver driver) {
	   Actions ac1 = new Actions(this.driver=driver);
	   ac1.dragAndDropBy(price_slider_lower, 100, 0).perform();
	   
   }
   
   public void button_Go() {
	   go_btn.click();
   }
   public void Selecting_first_product() {
	   first_product.click();
   }
   
   public void Ratings_Customer_review() {
	   customer_ratings.click();
	   }
   
  
   
 //3.Initialising the elements using PageFactory class inside the constructor
 		public Search_Result_Page(WebDriver driver)
 		{
 			PageFactory.initElements(driver,this);
 		}
}
