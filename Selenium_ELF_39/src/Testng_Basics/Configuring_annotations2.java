package Testng_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configuring_annotations2 {
	@BeforeSuite
	public void a() {
		System.out.println("Beforesuit");
	}
	@BeforeTest
	public void b() {
		System.out.println("Beforetest");
	}
	@BeforeClass
	public void c() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void d() {
		System.out.println("Beforemethod");
	}
	@Test
	public void e() {
		System.out.println("toyota");
	}
	@Test
	public void f() {
		System.out.println("subaru");
	}
	@Test
	public void g() {
		System.out.println("merced");
	}
	@AfterMethod
	public void h() {
		System.out.println("Aftermethod");
	}
	
	@AfterClass
	public void i() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void j() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void k() {
		System.out.println("Aftersuite");
	}

}
