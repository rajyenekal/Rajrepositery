package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_ApparelsPage extends Utility_Methods {
	 public DWS_ApparelsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	 
	 @FindBy(xpath="(//a[@href=\"/50s-rockabilly-polka-dot-top-jr-plus-size\"])[2]")
	 WebElement click_shoe;
	 
	 public void Click_Shoe() {
		 click_shoe.click();
	 }
}