package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributemethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//get atribute method
		//String attribute_value=driver.findElement(By.linkText("Register")).getAttribute("class");
		//System.out.println(attribute_value);
		
		//String attribute_data=driver.findElement(By.linkText("Log in")).getAttribute("class");
		//System.out.println(attribute_data);
		
		String attribute_text=driver.findElement(By.partialLinkText("Shopping cart")).getAttribute("class");
		System.out.println(attribute_text);
		
		
	}

}
