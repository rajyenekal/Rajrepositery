package Testng_Basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class Wokingon_Properties{
	@Test
	public void propertydemo() throws IOException{
		String filepath="./Test_Configuration/TestConfiguration.properties";
		FileInputStream fis =new FileInputStream(filepath);
		
		//creating an object for Properties class
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Firstname")+" "+ prop.getProperty("Lastname"));

	}
}