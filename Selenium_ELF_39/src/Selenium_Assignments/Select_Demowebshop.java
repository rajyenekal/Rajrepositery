package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Demowebshop {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Books")).click();
		
		WebElement choose_book=driver.findElement(By.id("products-orderby"));
		
		Select sel =new Select( choose_book);
		
		sel.selectByIndex(2);
		
		Thread.sleep(1000);
		WebElement choose_page=driver.findElement(By.id("products-pagesize"));
		
		Select selec =new Select(choose_page);
		
		selec.selectByValue("https://demowebshop.tricentis.com/books?viewmode=list&pagesize=4");
		
		Thread.sleep(1000);
		
		WebElement choose_grid=driver.findElement(By.id("products-viewmode"));
		
		Select sele =new Select(choose_grid);
		
		sele.selectByVisibleText("List");
		
		
		
		
        
		
		
		
		
		
	}

}
