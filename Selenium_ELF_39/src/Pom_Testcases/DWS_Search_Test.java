package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_HomePage;
import Pom_pages.DWS_SearchPage;

public class DWS_Search_Test extends Basetest {
	@Test
	public void TC03() {
		//DWS_HomePage hp=new DWS_HomePage(driver);
		//hp.Click_search();
		
		 DWS_SearchPage sp=new DWS_SearchPage(driver);
		 sp.Enter_search("electronics");
		 sp.Click_Search();
	}

}
