package Pom_Testcases;

import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Pom_pages.DWS_HomePage;
import Pom_pages.DWS_ShoppingCartPage;

public class DWS_ShoppingCart_Test extends Basetest{
	@Test
	public void Tc05() throws InterruptedException {
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.Addtocart();
	
	
	DWS_ShoppingCartPage sp=new DWS_ShoppingCartPage(driver);
	sp.Addingto_cart();
	sp.Shoppping_Cart();
	//sp.Estimate();
	//sp.checkbox();
	//sp.Checkout();
	}
	
}
