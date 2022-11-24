package Testng_Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Workingon_retrieve_excel_data_using_Dataprovider {
	
	@Test(dataProvider="Login")
	public void retrieve_excel_data() throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/testdata.xlsx");
		
		//object for Excel file
		Workbook book=new XSSFWorkbook(fis)	;
		Sheet sheet = book.getSheet("Sheet1");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		Object [][] data = new Object [rowcount][colcount];
		
		//print all the rows and columns
		
		for(int row=1;row<rowcount-1;row++) {
			
			for(int col=0;col<colcount-1;col++) {
				
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();	
				
			}
			
			System.out.println();
		}
			//print all the values present in data object
		for(int i=0;i<=data.length-1;i++) {
			
			for(int j=0;j<=data[i].length-1;j++) {
				
				System.out.println(data[i][j]);
			}
				
			
			
		}
		
		
		
		}
	
	
	
		
		
	}
	
	


