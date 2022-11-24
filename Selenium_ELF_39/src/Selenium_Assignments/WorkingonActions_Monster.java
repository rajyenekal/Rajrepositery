package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingonActions_Monster {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		WebElement jobsearch=driver.findElement(By.xpath("(//a[@data-check=\"menutab\"])[1]"));
		
		WebElement jobsbyskills=driver.findElement(By.xpath("(//a[@href=\"javascript:void(0);\"])[3]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(jobsearch).build().perform();
		action.moveToElement(jobsbyskills).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("(//a[@href=\"https://www.monsterindia.com/search/java-jobs\"])[1]"))).click().perform();
		driver.quit();
	}

}
