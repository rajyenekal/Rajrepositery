package Pom_Testcases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework_Utility.Basetest;
import Framework_Utility.Utility_Methods;
import Pom_pages.DWS_HomePage;
import Pom_pages.DWS_LoginPage;

public class DWS_Login_Test extends Basetest  {
	
		@DataProvider(name="login")
		public Object[]LOg_in() throws IOException{
			
			Object[][]log=Utility_Methods.getTestData("Login");
			
			return log;
			
		}
		@Test(dataProvider = "login")
		public void TC01(String value1,String value2) {
			DWS_HomePage hp=new DWS_HomePage(driver);	
			hp.Click_login();
			
			DWS_LoginPage lp=new DWS_LoginPage(driver);
			lp.Enter_username(value1);
			
			lp.Enter_password(value2);
			
			lp.Click_Login();
		}	
}
