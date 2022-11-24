package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_ApparelsPage;
import Pom_pages.DWS_HomePage;

public class DWS_Apparel_Test extends Basetest {
	@Test
	public void TC08() {
		
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.Apparels();
	
	
	DWS_ApparelsPage ap=new DWS_ApparelsPage(driver);
	ap.Click_Shoe();
	}
	
}
