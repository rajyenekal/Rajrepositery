package Selenium_Assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Endtoend_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right_click=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

		Actions action=new Actions(driver);
		Thread.sleep(1000);
		
		//storing webelement in list
		List<WebElement>options=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		
		//looping the options
		for(int i=1;i<=options.size();i++){
			
			action.contextClick(right_click).build().perform();
			options.get(i).click();
			//options.get(i).getText();
			Thread.sleep(1000);
			Alert ale=driver.switchTo().alert();
			ale.accept();	
		}
		//driver.close();
		
	}

}
