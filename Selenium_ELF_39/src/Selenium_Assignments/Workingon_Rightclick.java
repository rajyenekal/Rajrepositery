package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingon_Rightclick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//identify the webelement on which i have to double click
		WebElement right_click=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions action=new Actions(driver);
		
		action .contextClick(right_click).build().perform();
		
		
	}

}
