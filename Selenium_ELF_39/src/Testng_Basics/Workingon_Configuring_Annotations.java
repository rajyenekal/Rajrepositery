package Testng_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Workingon_Configuring_Annotations {
	@BeforeClass
	public void before_class() {
		System.out.println("Executing before class");
	}
	@BeforeSuite
	public void before_suit() {
		System.out.println("Executing before suit");
	}
	@Test
	public void Lambo() {
		System.out.println("Lambo aventador");
	}
	@Test
	public void Ducati() {
		System.out.println("ducati panegale");
	}
	@AfterSuite
	public void After_suit() {
		System.out.println("Executing aftersuit");
	}
	@AfterClass
	public void After_class() {
		System.out.println("Executing Afterclass");
	}
}
