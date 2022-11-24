package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_HomePage;
import Pom_pages.DWS_VotePage;

public class DWS_Vote_Test extends Basetest{
	@Test
	public void TC14() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.vote();
		
		DWS_VotePage vp=new DWS_VotePage(driver);
		vp.Votepool();
	}	

}
