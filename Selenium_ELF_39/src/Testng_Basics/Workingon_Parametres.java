package Testng_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Workingon_Parametres {
	
		@Parameters({"URL","Product"})
		@Test
		public void paralleldemo(String raj,String val){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		driver.get("raj");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("val");
		driver.close();
		
		}


}
