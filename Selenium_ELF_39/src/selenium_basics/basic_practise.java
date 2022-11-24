package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class basic_practise {
  @Test
    public void demo(){
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
     }
   }
