package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_AdvancedsearchPage extends Utility_Methods{
	//constructor
		public DWS_AdvancedsearchPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//input[@class=\'search-box-text ui-autocomplete-input\']")
		WebElement search_item;
		
		public void Search_item(String item) {
			Utility_Methods.Enter_Value_In_Edit_Field(search_item, item);
		}
		
		@FindBy(xpath="(//input[@type=\'submit\'])[1]")
		WebElement click_search;
		
		public void Click_search() {
			Utility_Methods.click_Element(click_search);
		}
		
		
		@FindBy(xpath="//input[@id=\"As\"]")
		WebElement advsearch;
		
		public void AdvSearch() {
			Utility_Methods.click_Element(advsearch);
		}
		

		@FindBy(xpath="//select[@name='Cid']")
		WebElement category;
		
		
		public void Category(String Value1) {
			Utility_Methods.dropdownby_Value(category,Value1);
		}
		
		@FindBy(xpath="//input[@id='Isc']")
		WebElement checkbox;
		
		public void Checkbox() {
			Utility_Methods.click_Element(checkbox);
		}
		
		@FindBy(xpath="(//select[@data-val='true'])[2]")
		WebElement mfg;
		
		public void Mfg(String val) {
			Utility_Methods.dropdownby_Value(mfg, val);
		}
		
		@FindBy(xpath="//input[@class=\'price-from\']")
		WebElement from;
		
		public void From(String start){
			Utility_Methods.Enter_Value_In_Edit_Field(from, start);
		}
		
		@FindBy(xpath="//input[@class=\'price-to\']")
		WebElement to;
		
		public void To(String end) {
			Utility_Methods.Enter_Value_In_Edit_Field(to,end);
		}
		
		@FindBy(xpath="(//input[@type=\'submit\'])[2]")
		WebElement final_search;
		
		public void Final_search() {
			Utility_Methods.click_Element(final_search);
		}
}
