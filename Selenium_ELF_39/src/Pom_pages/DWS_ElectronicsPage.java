package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_ElectronicsPage extends Utility_Methods{
	public DWS_ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//webelement
	@FindBy(xpath="(//div[@class=\"sub-category-item\"])[1]")
	WebElement camera;
	
	public void Click_camera() {
		camera.click();
	}
}
