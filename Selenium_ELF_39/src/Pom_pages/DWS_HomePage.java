package Pom_pages;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_HomePage extends Utility_Methods{
	//Constructor -to intialize the driver instance and webelements
	public DWS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	//WebElements
	@FindBy(xpath="//a[@class=\"ico-login\"]")
	WebElement login_link;

	//Method
	public void Click_login() {
		login_link.click();
	}
	//WebElement
	@FindBy(xpath="//a[@class=\"ico-register\"]")
	WebElement Register_link;
	
	//Method
	public void Click_Register() {
		Register_link.click();
	}
	//webelement
	@FindBy(xpath="//input[@id=\"small-searchterms\"]")
	WebElement Search_link;
	
	//Method
	public void Click_search() {
		Search_link.click();
	}

	//webelement
	@FindBy(xpath="(//a[@href=\"/books\"])[1]")
	WebElement Book_Link;
	
	//method
	public void Clickon_Book() {
		Book_Link.click();
	}
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement addtocart;
	
	public void Addtocart() {
		Utility_Methods.click_Element(addtocart);
	}
	
	@FindBy(xpath="(//a[@href=\"/computers\"])[1]")
	WebElement computer1;
	
	public void Computer() {
		//WebDriver driver=new ChromeDriver();
		
		//Actions action=new Actions(driver);
		//action.moveToElement(computer1).build().perform();
		computer1.click();
	}
	
	@FindBy(xpath="(//a[@href=\"/electronics\"])[1]")
	WebElement electronics;
	
	public void Electronics() {
	//WebDriver driver=new ChromeDriver();
			
	//Actions action=new Actions(driver);
	//action.moveToElement(electronics).build().perform();
	electronics.click();
	
	}
	
	@FindBy(xpath="(//a[@href=\"/apparel-shoes\"])[1]")
	WebElement apparels;
	
	public void Apparels() {
		apparels.click();
	}
	
	@FindBy(xpath="(//a[@href=\"/digital-downloads\"])[1]")
	WebElement digital;
	
	public void Digital() {
		digital.click();;
	}
	
	@FindBy(xpath="(//a[@href=\"/jewelry\"])[1]")
	WebElement jewelry;
	
	public void Jewelery() {
		jewelry.click();
	}

	@FindBy(xpath="(//a[@href=\"/gift-cards\"])[1]")
	WebElement gift;
	
	public void Gift() {
		gift.click();
	}
	
	@FindBy(xpath="//input[@id='newsletter-email']")
	WebElement subscribe;
	
	public void Subscribe() {
		Utility_Methods.click_Element(subscribe);
	}
	
	@FindBy(xpath="//label[@for='pollanswers-1']")
	WebElement vote;
	
	public void vote() {
		Utility_Methods.click_Element(vote);
	}
	
	@FindBy(xpath="//a[@href='/producttag/8/awesome']")
	WebElement favtag;
	
	public void Favtag() {
		Utility_Methods.click_Element(favtag);
	}
}
