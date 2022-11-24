package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_DigitalPage;
import Pom_pages.DWS_HomePage;

public class DWS_Digital_Test extends Basetest {
	@Test
	public void TC09() {
		
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.Digital();
	
	
	DWS_DigitalPage dp=new DWS_DigitalPage(driver);
	
	dp.Click_Digital();
	}
	
	

}
