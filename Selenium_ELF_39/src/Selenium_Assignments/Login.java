package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize()	;
		
		driver.findElement(By.className("ico-login")).click();
		
		driver.findElement(By.id("Email")).sendKeys("rajaneesh@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("input[class=\"button-1 login-button\"]")).click();
		
		String expected="rajaneesh@gmail.com";
		
		String actual=driver.findElement(By.className("account")).getText();
		
		if(expected.equalsIgnoreCase(actual)){
			
			System.out.println("login success");
		}
		else {
			System.out.println("login failed");
		}
		driver.close();
		
	}

}
