package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Endtoendtc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.name("Gender")).click();
		
		driver.findElement(By.id("Firstname")).sendKeys("rajaneesh");
		
		driver.findElement(By.id("Lastname")).sendKeys("gowda");
		
		driver.findElement(By.id("Email")).sendKeys("rajyenekal@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("raj1234");
		
		driver.findElement(By.id("Confirmpassword")).sendKeys("raj1234");
		
		driver.findElement(By.id("register-button")).click();
		
		driver.quit();
		
		
		
		
				
			
				
		
		
	}

	
	}


