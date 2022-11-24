package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_BookPage;
import Pom_pages.DWS_HomePage;

public class DWS_Book_Test extends Basetest {
	@Test
	public void Tc04() throws InterruptedException {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Clickon_Book();
		
		DWS_BookPage bp=new DWS_BookPage(driver);
		bp.Clickany_Book();
		bp.click_cart();
		
	}

}

