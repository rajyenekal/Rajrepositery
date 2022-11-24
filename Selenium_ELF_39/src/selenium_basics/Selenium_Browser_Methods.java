package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Browser_Methods  {

	public static void main(String[] args)throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		//LAunch Chrome Driver
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://drive.google.com/?tab=ro&authuser=0");
		
		//launch firefox driver
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.get("");		
		
	}

}
