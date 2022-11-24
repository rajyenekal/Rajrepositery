package Selenium_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Html_Specified_Browser {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Downloads/MultipleWindow.html");
		
		driver.manage().window().maximize();
		
		String parent_window=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@type=\'button\']")).click();
		Thread.sleep(3000);
		
		Set<String>total_windows=driver.getWindowHandles();

		for(String child_window:total_windows) {
			
			driver.switchTo().window(child_window);
			
			if(driver.getTitle().equalsIgnoreCase(
			 "Olive Garden Italian Restaurant | Family Style Dining | Italian Food")){
				
				driver.close();
			}
		//driver.quit();
		}
			
	}

}
