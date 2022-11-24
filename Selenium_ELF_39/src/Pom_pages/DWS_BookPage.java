package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_BookPage extends Utility_Methods {
	public DWS_BookPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//webelements
	//@FindBy(xpath="(//a[@href=\"/computing-and-internet\"])[4]")
	@FindBy(xpath="(//img[@title=\"Show details for Computing and Internet\"])[1]")
	WebElement click_anybook;
	
	public void Clickany_Book() {
		click_anybook.click();
	}
	
	//webelements
	@FindBy(xpath="//input[@id=\"add-to-cart-button-13\"]")
	WebElement addtocart;
	
	public void click_cart() {
		addtocart.click();
		
	}
	
	

}
