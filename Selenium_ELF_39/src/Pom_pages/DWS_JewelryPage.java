package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_JewelryPage extends Utility_Methods {
	 public DWS_JewelryPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}
		 
		 @FindBy(xpath="(//div[@class=\"picture\"])[2]")
		 WebElement click_jewelry;
		 
		 public void Click_Jewelry() {
			 click_jewelry.click();
		 }

}
