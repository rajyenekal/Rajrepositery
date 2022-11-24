package Selenium_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicmethods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		
		//launch the browser
		wd.get("https://www.google.co.in");
		//using navigate-to
		wd.navigate().to("https://www.redbus.co.in");
		wd.manage().window().maximize();
		wd.navigate().back();
		wd.navigate().forward();
		wd.navigate().refresh();
		//to close the browser
		wd.close();
		
		
		
		
	}

}
