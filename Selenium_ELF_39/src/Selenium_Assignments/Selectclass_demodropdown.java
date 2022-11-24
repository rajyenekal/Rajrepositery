package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass_demodropdown {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Downloads/demo.html");
		driver.manage().window().maximize();
		
		//identify the webelement of select type
		WebElement select_car=driver.findElement(By.id("standard_cars"));
		
		//creating object for select class
		Select sel =new Select(select_car);
		
		//select by visible text
		sel.selectByVisibleText("Audi");
		
		Thread.sleep(1000);
		
		//select by value
		sel.selectByValue("jgr");
		
		Thread.sleep(1000);
		
		//select by Index
		sel.selectByIndex(4);
	
		
		
		
	}

}
