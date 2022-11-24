package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingonactions_Computeraccessories {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement computer=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
		
		//creating an object for action class
		Actions action=new Actions(driver);
		action.moveToElement(computer).build().perform();
		
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"))).click().perform();
		
		//action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]"))).click().perform();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
