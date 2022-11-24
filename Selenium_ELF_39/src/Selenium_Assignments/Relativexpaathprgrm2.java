package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpaathprgrm2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@name=\"Gender\"]")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("rajaneesh");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("raj");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rajyenekal@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("567778");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("567778");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		driver.findElement(By.xpath("//label[@for='pollanswers-1']")).click();
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		driver.quit();
		
	}

}
