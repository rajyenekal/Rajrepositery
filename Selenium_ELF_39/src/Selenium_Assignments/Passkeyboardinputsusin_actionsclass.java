package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Passkeyboardinputsusin_actionsclass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		Actions action=new Actions(driver);
		
		//action.moveToElement(search).click().sendKeys("toyotasupra").perform();
		
		//passing keyboardinput
		action.sendKeys(search,"nissangtr").perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.quit();
			
	}

}
