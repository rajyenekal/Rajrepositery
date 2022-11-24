package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_VotePage extends Utility_Methods{
	public DWS_VotePage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='vote-poll-1']")
	WebElement votepool;
	
	public void Votepool() {
		Utility_Methods.click_Element(votepool);
	}
}
