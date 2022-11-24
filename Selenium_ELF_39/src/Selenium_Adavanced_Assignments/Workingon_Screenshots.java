package Selenium_Adavanced_Assignments;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Workingon_Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//Takescreenshot typecasting with driver instance
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File homepage=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshots1/now.png");
		FileHandler.copy(homepage,destination);
		
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		//File ss=ts.getScreenshotAs(OutputType.FILE);
	}

}
