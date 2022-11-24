package Selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtoiframe_Switchbackto_Parent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium%20practice%20links/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//identify the frame and switch to it
		WebElement frame=driver.findElement(By.id("FR1"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//switch back to default content
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}

}
