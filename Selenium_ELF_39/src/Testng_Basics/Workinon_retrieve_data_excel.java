package Testng_Basics;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Workinon_retrieve_data_excel {
	@Test
	public void retrieve_excel_data() throws IOException {
		//to read data from a file
		FileInputStream fis=new FileInputStream("./Testdata/testdata.xlsx");
		
		//workbook is a interface,XSSFwb is a class
		Workbook book=new XSSFWorkbook(fis);
		
		//getting particular sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		//to get the used  no.of column counts 
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		//to get the used  no.of row counts 
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		//to print data present in cells
		for(int i=0;i<rowcount;i++) {
			
			for(int j=0;j<colcount;j++) {
				
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println("  ");
		}
	}
}
