package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_ElectronicsPage;
import Pom_pages.DWS_HomePage;

public class DWS_Electronics_Test extends Basetest{
	@Test
	public void TC07() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Electronics();
		
		DWS_ElectronicsPage ep=new DWS_ElectronicsPage(driver);
		ep.Click_camera();
	}
	

}
