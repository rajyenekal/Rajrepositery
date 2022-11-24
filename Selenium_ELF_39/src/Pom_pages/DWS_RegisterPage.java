package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_RegisterPage extends Utility_Methods{
	//constructor
	public DWS_RegisterPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//webelements
	@FindBy(id="gender-male")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmpass;
	
	@FindBy(id="register-button")
	WebElement button;
	
	//Methods
	public void click_gender() {
		gender.click();
	}
	
	public void Enter_Firstname(String value) {
		firstname.sendKeys(value);
	}
	
	public void Enter_Lastname(String value) {
		lastname.sendKeys(value);
	}
	public void Enter_Email(String value) {
		email.sendKeys(value);
	}
	
	public void Enter_Password(String value) {
		password.sendKeys(value);
	}
	
	public void Enter_confpassword(String value) {
		confirmpass.sendKeys(value);
	}
	
	public void Click_Register() {
		button.click();
	}
			
}
