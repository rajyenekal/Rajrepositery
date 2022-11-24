package TestNG_Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Basetest;
import Framework_Utility.Utility_Methods;

public class Workingon_Register_Testcase extends Basetest {

	@DataProvider(name="register")
	
		public Object[]testdata() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Register");
		
		//data[0][0]="Rajaneesh";
		//data[0][1]="K B";
		//data[0][2]="rajyenekal92@gmail.com";
		//data[0][3]="raj1234";
		//data[0][4]="raj1234";
		return data;
	}
	
	@Test(dataProvider="register")
	
	public void demo(String firstname, String lastname, String email, String password, String confirmpassword ) {
		
		WebElement click=driver.findElement(By.linkText("Register"));
		Utility_Methods.click_Element(click);
		
		WebElement Fn=driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
		Utility_Methods.Enter_Value_In_Edit_Field(Fn, firstname);
		
		WebElement Ln= driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
		Utility_Methods.Enter_Value_In_Edit_Field(Ln, lastname);
		
		WebElement Email= driver.findElement(By.xpath("//input[@name=\"Email\"]"));
		Utility_Methods.Enter_Value_In_Edit_Field(Email, email);
		
		WebElement Pass=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Utility_Methods.Enter_Value_In_Edit_Field(Pass, password);
		
		WebElement click2=driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
		Utility_Methods.Enter_Value_In_Edit_Field(click2, confirmpassword);
		
		WebElement click3= driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
		Utility_Methods.click_Element(click3);
		
		WebElement click4= driver.findElement(By.xpath("//input[@type=\"button\"][1]"));
		Utility_Methods.click_Element(click4);
	
	}
	
}
