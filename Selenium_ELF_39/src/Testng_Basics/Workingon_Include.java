package Testng_Basics;

import org.testng.annotations.Test;

public class Workingon_Include {
@Test(priority = 2)
	
	public void Loginto_DWS() {
		System.out.println("Executing login tc");
	}
	@Test(priority = 1)
	public void Register() {
		System.out.println("Executing register tc");
	}
	
	@Test(priority = 3)
	
	public void Search() {
		System.out.println("Executing search tc");
	}
	
	@Test(priority = 4)
	
	public void Wishlist() {
		System.out.println("Executing wishlist");
	}
	
	@Test(priority = 5)
	
	public void addtocart() {
		System.out.println("Executing addtocart");
	}


}
