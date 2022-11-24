package Testng_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workingon_Excel_eliminate_header {
	public void Eliminate_header() throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/testdata.xlsx");
		
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");
		
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		for(int i=1;i<rowcount-1;i++) {
			for(int j=0;j<colcount-1;j++) {
				
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
	}

}
