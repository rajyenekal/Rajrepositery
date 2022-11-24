package Testng_Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class Workinon_Dataprovider_Register {
	@DataProvider(name= "TestData")
	public Object[][]testdata(){
	Object[][]data= new Object[5][5];
	
	   data[0][0]="Rajaneesh";
	   data[0][1]="Gowda";
	   data[0][2]="rajaneesh12@gmail.com";
	   data[0][3]="rajyenekal";
	   data[0][4] ="rajyenekal" ;
	   
	   data[1][0]="Darshan";
	   data[1][1]="Gowda";
	   data[1][2]="Darshan12@gmail.com";
	   data[1][3]="dboss";
	   data[1][4] ="dboss" ;
	   
	   data[2][0]="Soma";
	   data[2][1]="shekar";
	   data[2][2]="somashekar12@gmail.com";
	   data[2][3]="somashe";
	   data[2][4] ="somashe" ;

	   data[3][0]="Chethan";
	   data[3][1]="chethu";
	   data[3][2]="chethan12@gmail.com";
	   data[3][3]="chethya";
	   data[3][4] ="chethya" ;
	   
	   data[4][0]="Pramod";
	   data[4][1]="pammu";
	   data[4][2]="pramod12@gmail.com";
	   data[4][3]="pramodaa";
	   data[4][4] ="pramodaa" ;
	   
	   
	return data;
	}
	@Test(dataProvider="TestData")


	public void register(String firstname, String lastname, String email, String password ,String confirmpassword) {
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/cart") ;
	driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click()
	;
	driver.findElement(By.name("FirstName")).sendKeys(firstname);
	driver.findElement(By.name("LastName")).sendKeys(lastname);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.name("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
	driver.findElement(By.name("register-button")).click();
	driver.close();
	

	}

	}


	
	
