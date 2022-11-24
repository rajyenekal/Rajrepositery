package Selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingon_Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium%20practice%20links/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//identify the frame and switch to it
		//switch the frame by index
		
		driver.switchTo().frame(6);
		
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.quit();
		
		

	}

}
