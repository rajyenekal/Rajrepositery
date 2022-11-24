package Flipcart_Testcase;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Basetest_Flipcart;


public class Working_on_Signup_Flipcart extends Basetest_Flipcart{
 @DataProvider(name="signup")

	public Object[]testdata() throws IOException{
	
	 Object[][]data=new Object[1][1];
	 	data[0][0]="9741846197";
	 	data[0][1]="ka05kc7125";
	 
	 return data;
	
	}
	@Test(dataProvider ="signup")
	public void sign(String Email,String Password) {
		
		
		 driver.findElement(By.className("_1_3w1N")).click();
		 //WebElement click=
		//Utility_Methods.click_Element(click);
		
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys(Email);
		//WebElement email=
		//Utility_Methods.Enter_Value_In_Edit_Field(email,Password);
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys(Password);
		//WebElement sign=driver.findElement(By);
		//Utility_Methods.click_Element(sign);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	}
			

}
