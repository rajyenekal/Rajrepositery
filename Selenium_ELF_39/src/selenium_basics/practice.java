package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
	//dr.get("https://www.google.com");
	dr.navigate().to("https://www.google.com");
	dr.manage().window().maximize();
	dr.navigate().to("https://demowebshop.tricentis.com/");
   // dr.findElement(By.linkText("Register")).click();
    //dr.findElement(By.id("FirstName")).sendKeys("raj");
    //dr.findElement(By.name("LastName")).sendKeys("rajaneesh");
   dr.findElement(By.partialLinkText("Shop")).click();
	
	
	
		
	}

}
