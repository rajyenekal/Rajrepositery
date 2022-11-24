package Selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printtext_Sortbydropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		driver.manage().window().maximize();
		WebElement books=driver.findElement(By.name("products-orderby"));
		
		Select sel=new Select(books);
		
		List<WebElement> text=sel.getOptions();
		for(int i=0;i<text.size();i++) {
			
			System.out.println(text.get(i).getText());
		}
	}

}
