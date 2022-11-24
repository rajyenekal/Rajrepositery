package Pom_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Framework_Utility.Utility_Methods;
import Pom_pages.DWS_HomePage;
import Pom_pages.DWS_SubscribePage;

public class DWS_Subscribe_Test extends Basetest{
@DataProvider(name="Subscribe")
	
	public Object[]Subscribebutton() throws IOException{
		
		Object[][]button=Utility_Methods.getTestData("subs");
		
		return button;
		}
	@Test(dataProvider = "Subscribe")
	public void TC13(String email) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Subscribe();
		
		DWS_SubscribePage sp=new DWS_SubscribePage(driver);
		sp.Subscribe(email);
		sp.Button();
		
	}

}
