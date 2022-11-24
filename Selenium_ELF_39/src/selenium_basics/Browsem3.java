package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsem3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver raj=new ChromeDriver();
		raj.get("https://www.google.com/");
		raj.manage().window().maximize();
		raj.close();
		
	}

}
