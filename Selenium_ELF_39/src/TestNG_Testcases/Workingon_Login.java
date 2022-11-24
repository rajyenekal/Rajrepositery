package TestNG_Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework_Utility.Basetest;
import Framework_Utility.Utility_Methods;

public class Workingon_Login extends Basetest {
	

	@DataProvider(name="login")
	
	public Object[]testlog() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Login1");
		
		//data[0][0]="rajyenekal92@gmail.com";
		//data[0][1]="raj1234";
		
		return data;
	}
	
	@Test(dataProvider="login")
	
	public void demo(String Email, String Password) {
		
		
		WebElement click=driver.findElement(By.linkText("Log in"));
		Utility_Methods.click_Element(click);
		
		WebElement email=driver.findElement(By.id("Email"));
		Utility_Methods.Enter_Value_In_Edit_Field(email, Email);
		
		WebElement Pass=driver.findElement(By.id("Password"));
		Utility_Methods.Enter_Value_In_Edit_Field(Pass, Password);
		
		WebElement click2=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		Utility_Methods.click_Element(click2);
		
		WebElement click3=driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
		Utility_Methods.click_Element(click3);
		
	}	    
}
