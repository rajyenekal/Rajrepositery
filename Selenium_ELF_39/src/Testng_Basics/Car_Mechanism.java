package Testng_Basics;

import org.testng.annotations.Test;

public class Car_Mechanism {
	@Test(dependsOnMethods = "Open_door")
	public void Start_car() {
		System.out.println("Executing start car");
	}
	@Test(dependsOnMethods = "Start_car")
	public void Shift_gear() {
		System.out.println("Executing shift gear");
	}
	@Test(dependsOnMethods = "Unlock_car")
	public void Open_door() {
		System.out.println("Executing Open the door");
	}
	@Test
	public void Unlock_car() {
		System.out.println("Executing Unlocking the car");
	}
}	

