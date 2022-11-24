package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		
		
		WebDriver e1=new ChromeDriver();
		
		e1.get("https://demowebshop.tricentis.com/");
		
		e1.manage().window().maximize();
		
		e1.findElement(By.partialLinkText("Log")).click();
		
		//e1.close();
		
		
		
		
		
	}

}
