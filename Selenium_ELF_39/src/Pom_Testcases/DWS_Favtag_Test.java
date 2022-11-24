package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_FavtagPage;
import Pom_pages.DWS_HomePage;

public class DWS_Favtag_Test extends Basetest{
	@Test
	public void TC15() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Favtag();
		
		DWS_FavtagPage fp=new DWS_FavtagPage(driver);
		fp.nextpg();
	}
	

}
