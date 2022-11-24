package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_m2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		
		WebDriver driver2= new FirefoxDriver();
		
		driver2.get("https://www.redbus.com/");		
		
		
	}

}
