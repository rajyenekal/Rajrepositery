package Selenium_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workinon_Multiplewindows {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//Make a note of parent window first
		String parent_window=driver.getWindowHandle();
		//System.out.println(parent_window);
		
		//identify the facebook link
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
	
		
		Set<String> total_windows=driver.getWindowHandles();
		//System.out.println(total_windows);
		
			for(String child_window:total_windows) {
			//System.out.println(child_window);
			
			//switch to child windows
			
		driver.switchTo().window(child_window);
			//to print the title
		System.out.println(driver.getTitle());
			
		if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
		
				driver.findElement(By.name("email")).sendKeys("qwere@gmail.com");
				Thread.sleep(2000);
				driver.close();	
				
				//switch back to parent window
				driver.switchTo().window(parent_window);
				driver.quit();	
	       }		
		}
	}
}


	

