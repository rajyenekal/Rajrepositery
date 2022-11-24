package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vinya/Downloads/xpath1.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div/input")).sendKeys("rajaneesh");
		driver.findElement(By.xpath("/html/body/div/input[2]")).sendKeys("gowda");
		driver.findElement(By.xpath("/html/body/div[2]/input")).sendKeys("Testyantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bangalore");
		
		driver.quit();
		

	}

}
