package Selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working0n_Webdriverwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//create an object for webdriver wait
		//WebDriverWait wait=new WebDriverWait(driver,25);
		
		
		driver.findElement(By.linkText("Register")).click();
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='/register']"))));
		
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys("rajaneesh");
		driver.findElement(By.name("LastName")).sendKeys("gowda");
		
		driver.findElement(By.name("Email")).sendKeys("rajsupragmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("raj1234");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("raj1234");
		
		driver.findElement(By.name("register-button")).click();
		
		driver.close();
		
		}

	}
