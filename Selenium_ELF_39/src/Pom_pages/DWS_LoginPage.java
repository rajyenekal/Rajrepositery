package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_LoginPage extends Utility_Methods{
	//constructor
	public DWS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}
	//Webelements
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement login_btn;
	
	//Methods
	public void Enter_username(String value) {
		Utility_Methods.Enter_Value_In_Edit_Field(username, value);
	}
	
	public void Enter_password(String value) {
		Utility_Methods.Enter_Value_In_Edit_Field(password, value);
		
	}
	public void Click_Login() {
		Utility_Methods.click_Element(login_btn);
	}
}
