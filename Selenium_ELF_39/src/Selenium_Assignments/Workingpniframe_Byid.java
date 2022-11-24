package Selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingpniframe_Byid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium%20practice%20links/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//switch to frame by id
		//driver.switchTo().frame(driver.findElement(By.id("FR1")));
		
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Books");
		
		//switch to frame by webelement
		//driver.switchTo().frame(driver.findElement(By.id("FR1"));

	}

}
