package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssvaluemethod {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String css_value= driver.findElement(By.linkText("Register")).getCssValue("background-attachment");
		System.out.println(css_value);
		
		
	}

}
