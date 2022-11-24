package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver enter= new ChromeDriver();
		
		enter.get("https://demowebshop.tricentis.com/");
		
		enter.manage().window().maximize();
		
		enter.findElement(By.linkText("Register")).click();
		
		enter.findElement(By.id("FirstName")).sendKeys("Rajaneesh");
		
		enter.findElement(By.name("LastName")).sendKeys("Gowda");
		
		enter.quit();
	}

}
