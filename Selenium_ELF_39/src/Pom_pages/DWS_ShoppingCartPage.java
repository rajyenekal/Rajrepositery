package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_ShoppingCartPage extends Utility_Methods{
	public DWS_ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(xpath="//input[@id='add-to-cart-button-2']")
	WebElement addingto_cart;
	
	public void Addingto_cart() {
		Utility_Methods.click_Element(addingto_cart);
	}
	

	@FindBy(xpath="(//span[@class=\"cart-label\"])[1]")
	WebElement shopping_cart;
	 
	public void Shoppping_Cart() {
		shopping_cart.click();
	}
	
	
	
	@FindBy(xpath="//input[@name=\"estimateshipping\"]")
	WebElement estimate;
	
	public void Estimate() {
		estimate.click();
	}
	
	@FindBy(xpath="//input[@id=\"termsofservice\"]")
	WebElement checkbox;
	
	public void checkbox() {
		checkbox.click();
	}
	
	@FindBy(xpath="//button[@id=\"checkout\"]")
	WebElement checkout;
	
	public void Checkout() {
		checkout.click();
	}
	
}