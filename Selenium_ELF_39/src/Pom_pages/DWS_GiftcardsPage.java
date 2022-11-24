package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_GiftcardsPage extends Utility_Methods{
	//constructor
		public DWS_GiftcardsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);	
			}
		
		@FindBy(xpath="(//a[@href=\"/5-virtual-gift-card\"])[2]")
		WebElement click_gift;
		
		public void Click_Gift () {
			click_gift.click();
		}
		
		

}
