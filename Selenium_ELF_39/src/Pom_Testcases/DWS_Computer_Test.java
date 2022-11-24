package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_ComputerPage;
import Pom_pages.DWS_HomePage;

public class DWS_Computer_Test extends Basetest {
	
	@Test
	public void TC06() {
	DWS_HomePage hp =new DWS_HomePage(driver);
	hp.Computer();
	
	
	DWS_ComputerPage cp=new DWS_ComputerPage(driver);
	
	cp.Click_Desktop();
	
	}
}
