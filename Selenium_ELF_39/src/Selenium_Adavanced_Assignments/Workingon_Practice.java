package Selenium_Adavanced_Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workingon_Practice {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//radio button
		driver.findElement(By.name("radioButton")).click();
		
		//auto suggestion
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("afghan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui-menu-item-wrapper']")).click();
		
		//Handling dropdown
		WebElement drop=driver.findElement(By.xpath(" //select [@id='dropdown-class-example']"));
		Select sele= new Select (drop);
		
		sele.selectByIndex(1);
		sele.selectByValue("option2");
		sele.selectByVisibleText("Option3");
		
		//Handing checkbox		
		List<WebElement> check= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i<=check.size()-1; i++){
			check.get(i).click();
			
			}
	}
}
