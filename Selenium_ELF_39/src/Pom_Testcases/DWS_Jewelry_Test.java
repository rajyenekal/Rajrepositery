package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_HomePage;
import Pom_pages.DWS_JewelryPage;

public class DWS_Jewelry_Test extends Basetest{
	@Test
	public void TC10() {
		
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.Jewelery();
	
	
	DWS_JewelryPage jp=new DWS_JewelryPage(driver);
	
	jp.Click_Jewelry();	}
	

}
