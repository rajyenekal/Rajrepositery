package Testng_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Workingon_Parallelexecution_XML {
	@Test(invocationCount = 3,threadPoolSize = 2)
	public void paralleldemo() {
		
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	
	//launch the browser
	WebDriver driver =new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("Computers");
	driver.close();
	
	}

}
