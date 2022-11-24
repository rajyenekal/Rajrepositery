package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingonDependent_Xparth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/desktops");
		driver.findElement(By.xpath("//h2[1]/a"));
		
		
	}

}
//(//input[@ type="button"])[2]/preceding-sibling::script