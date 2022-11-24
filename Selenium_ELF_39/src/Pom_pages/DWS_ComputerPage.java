package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_ComputerPage  extends Utility_Methods {
	public DWS_ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//div[@class=\"sub-category-item\"])[1]")
	WebElement desktop;
	
	public void Click_Desktop() {
		//WebDriver driver=new ChromeDriver();
		
		//Actions action=new Actions(driver);
		//action.moveToElement(desktop).click().perform();
		desktop.click();
	}
	
	
	
}	
