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

public class workingon_Search_ extends Basetest{
	
@DataProvider(name="search")
	
	public Object[]testsearch() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Search");
		
		//data[0][0]="computers";
		
		return data;
	}

	@Test(dataProvider="search")
	
	public void demo(String search) {
		
		WebElement Search= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		Utility_Methods.Enter_Value_In_Edit_Field(Search, search);
		
		WebElement click= driver.findElement(By.xpath("//input[@value='Search']"));
		Utility_Methods.click_Element(click);
		
	}
	
}
