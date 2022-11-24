package Selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printallbook_Titles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.name("Gender")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("toyota");
		
		driver.findElement(By.name("LastName")).sendKeys("supra");
		
		driver.findElement(By.name("Email")).sendKeys("supraaa@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("123456");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		
		driver.findElement(By.name("register-button")).click();
		
		driver.findElement(By.className("ico-logout")).click();
		
		driver.findElement(By.className("ico-login")).click();
	
		
		
		driver.findElement(By.name("Email")).sendKeys("supraaa@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.linkText("Books")).click();
		
		WebElement sort=driver.findElement(By.id("products-orderby"));
		
		Select sortby = new Select (sort);
		
		sortby.selectByIndex(1);
		
		//driver.findElements(By.linkText("//a"));
		
		List<WebElement>bookname=driver.findElements(By.xpath("//img"));
		
		for (int i=0;i<=bookname.size()-1;i++) {
			System.out.println(bookname.get(i).getAttribute("alt"));
			driver.quit();
		}
		
	}

}
