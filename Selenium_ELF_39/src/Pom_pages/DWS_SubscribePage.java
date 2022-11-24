package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_SubscribePage extends Utility_Methods{
	public DWS_SubscribePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='NewsletterEmail']")
	WebElement Subscribe1;
	
	public void Subscribe(String value1) {
		Utility_Methods.Enter_Value_In_Edit_Field(Subscribe1, value1);
	}
	
	@FindBy(xpath="//input[@value='Subscribe']")
	WebElement button;
	
	public void Button() {
		Utility_Methods.click_Element(button);
	}
	

}
