package Selenium_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingon_Robot_Class_ {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium%20practice%20links/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement fileupload_btn=driver.findElement(By.id("resume"));
		
		Actions action=new Actions(driver);
		action.moveToElement(fileupload_btn).click().perform();
		 Thread.sleep(2000);
		
		 //create an object for robot class
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_T);
		 robot.keyPress(KeyEvent.VK_E);
		 robot.keyPress(KeyEvent.VK_S);
		 robot.keyPress(KeyEvent.VK_T);
		 
		 for(int i=0;i<=2;i++) {
			 Thread.sleep(2000);
			 robot.keyPress(KeyEvent.VK_TAB);
			 
		 }
		 
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 //driver.quit();
		
	}
}
