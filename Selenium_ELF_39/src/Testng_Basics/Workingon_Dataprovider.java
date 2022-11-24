package Testng_Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Workingon_Dataprovider {
	@DataProvider(name="TestData")
		public Object [][] testdata(){
			Object [][] data=new Object [5][2];
			data[0][0]="Rajaneesh";
			data[0][1]="Gowda";
			data[1][0]="Heena";
			data[1][1]="mehak";
			data[2][0]="Soma";
			data[2][1]="shekara";
			data[3][0]="Keerthana";
			data[3][1]="kempi";
			data[4][0]="darshan";
			data[4][1]="dboss";
			return data;	
	}
	@Test(dataProvider ="TestData")
		public void testdatademo(String Firstname,String Lastname) {
		System.out.println(Firstname);
		System.out.println(Lastname);
	}
}
