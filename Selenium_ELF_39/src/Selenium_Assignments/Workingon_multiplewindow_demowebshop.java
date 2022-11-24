package Selenium_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingon_multiplewindow_demowebshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String parent_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		
		Set<String>total_windows=driver.getWindowHandles();
		//System.out.println(total_windows);
		
		for(String child_window:total_windows) {
			//System.out.println(child_window);
			
			//switch to child window
			driver.switchTo().window(child_window);
			//System.out.println(driver.getTitle());
			Thread.sleep(1000);
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				driver.close();
				//switch back to parent window
				driver.switchTo().window(parent_window);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("vivo mobiles");
				Thread.sleep(2000);
		
				driver.close();
				
			}}
			
			
			
	}

}
