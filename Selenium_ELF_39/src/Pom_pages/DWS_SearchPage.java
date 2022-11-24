package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_SearchPage extends Utility_Methods{
	//constructor
	public DWS_SearchPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Webelements
	@FindBy(xpath="//input[@id=\"small-searchterms\"]")
	WebElement search_item;
	
	//method
	public void Enter_search(String value) {
		search_item.sendKeys(value);
	}
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement click_search;
	
	//method
	public void Click_Search() {
		Utility_Methods.click_Element(click_search);
	}
}
