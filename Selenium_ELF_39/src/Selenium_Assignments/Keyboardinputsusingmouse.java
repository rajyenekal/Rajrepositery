package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardinputsusingmouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		Actions action=new Actions(driver);
		action.moveToElement(search).click().perform();
		
		action.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_SHIFT).perform();
		//Thread.sleep(2000);
		//action.keyDown(Keys.LEFT_SHIFT).sendKeys("rajaneesh").keyUp(Keys.LEFT_SHIFT).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
