package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion2 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			//identify the auto suggestion in web element
			
			driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("us");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//li[@class='ui-menu-item'])[8]")).click();			
			
			
			
	}

}
