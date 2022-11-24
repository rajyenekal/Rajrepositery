package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RergularExpression {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Camera, photo')]")).click();
	}

}
