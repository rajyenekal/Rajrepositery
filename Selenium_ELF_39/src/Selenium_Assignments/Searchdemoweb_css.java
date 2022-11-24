package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchdemoweb_css {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("computer");			
			driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
			
			
	}
		
		
	}


