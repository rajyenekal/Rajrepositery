package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_DigitalPage extends Utility_Methods {
	 public DWS_DigitalPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}
		 
		 @FindBy(xpath="(//div[@class=\"picture\"])[2]")
		 WebElement click_digital;
		 
		 public void Click_Digital() {
			 click_digital.click();
		 }

}
