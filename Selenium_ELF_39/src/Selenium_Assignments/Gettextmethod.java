package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		//Get Text method
		
		String text_value = driver.findElement(By.className("ico-login")).getText();
		
		System.out.println(text_value);
		
			
		
		String text=driver.findElement(By.className("cart-label")).getText();
		
		System.out.println(text);
		
		driver.quit();
		
		//String type;
		 //WebElement text_variable=driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"))getText();
		
		//System.out.println(text_variable);
		
	}

}
