package Testng_Basics;

import org.testng.annotations.Test;

public class Workingon_Exclude {
@Test(dependsOnMethods ="Register")
	
	public void Loginto_DWS() {
		System.out.println("Executing login tc");
	}
	@Test
	public void Register() {
		System.out.println("Executing register tc");
	}
	
	@Test(dependsOnMethods = "Loginto_DWS")
	
	public void Search() {
		System.out.println("Executing search tc");
	}
	
	@Test(dependsOnMethods = "Search" )
	
	public void Wishlist() {
		System.out.println("Executing wishlist");
	}
	
	@Test(dependsOnMethods = "Wishlist")
	
	public void addtocart() {
		System.out.println("Executing addtocart");
	}

}
