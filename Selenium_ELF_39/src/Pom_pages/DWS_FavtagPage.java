package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_FavtagPage extends Utility_Methods {
	public DWS_FavtagPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/producttag/8/awesome?pagenumber=2']")
	WebElement nextpg;
	
	
	public void nextpg() {
		Utility_Methods.click_Element(nextpg);
	}

}
