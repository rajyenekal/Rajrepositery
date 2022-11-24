package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingonDoubleclick {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//identify the webelement on which i have to double click
		WebElement dbl_click=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		
		//create object for action class
		Actions action=new Actions(driver);
		action.doubleClick(dbl_click).build().perform();
		driver.quit();
		
		
	}

}
