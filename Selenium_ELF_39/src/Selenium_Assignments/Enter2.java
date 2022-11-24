package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver e2=new ChromeDriver();
		
		e2.get("https://demowebshop.tricentis.com/");
		
		e2.manage().window().maximize();
		
		e2.findElement(By.partialLinkText("Shopping")).click();
		
		
		e2.close();
		
		
		
	}

}
