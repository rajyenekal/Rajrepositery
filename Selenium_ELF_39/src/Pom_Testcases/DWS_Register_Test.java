package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_HomePage;
import Pom_pages.DWS_RegisterPage;

public class DWS_Register_Test extends Basetest {
	@Test
	public void TC02() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Click_Register();
		
		DWS_RegisterPage rp=new DWS_RegisterPage(driver);
		rp.click_gender();
		rp.Enter_Firstname("Rajaneesh");
		rp.Enter_Lastname("K B");
		rp.Enter_Email("rajkb123@gmail.com");
		rp.Enter_Password("rajkb9741");
		rp.Enter_confpassword("rajkb9741");
	}

}
