package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		
		//launch the chrome browser
		WebDriver raj = new ChromeDriver();
		
		raj.get("https://demowebshop.tricentis.com/");
		
		raj.manage().window().maximize();
		
		raj.findElement(By.linkText("Log in")).click();
		
		raj.quit();
		
	}

}
