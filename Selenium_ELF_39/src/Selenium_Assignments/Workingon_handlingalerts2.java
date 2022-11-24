package Selenium_Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingon_handlingalerts2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		Actions action=new Actions(driver);
		action.click(submit).build().perform();
		Thread.sleep(2000);
		Alert ale=driver.switchTo().alert();
		
		Thread.sleep(2000);
		ale.accept();		
		
	}

}
