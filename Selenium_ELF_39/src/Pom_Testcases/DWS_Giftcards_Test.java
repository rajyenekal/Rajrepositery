package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_GiftcardsPage;
import Pom_pages.DWS_HomePage;

public class DWS_Giftcards_Test extends Basetest {
	@Test
	public void TC11() {
		
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.Gift();;
	
	
	DWS_GiftcardsPage ap=new DWS_GiftcardsPage(driver);
	ap.Click_Gift();
	}

}
