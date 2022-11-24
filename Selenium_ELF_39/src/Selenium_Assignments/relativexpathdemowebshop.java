package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpathdemowebshop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Vinya/Downloads/xpath1.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("rajaneesh");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("raj");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("testyantra");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("bangalore");
		
		
	}

}
