package Selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demofname {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Downloads/demo.html");
		
		driver.manage().window().maximize();
		List<WebElement> demod=driver.findElements(By.xpath("//input[@name=\"fname\"]"));
		for(int i=0;i<demod.size();i++) {
			demod.get(i).sendKeys("rajaneesh");
		}
	}

}
