package Testng_Basics;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Workingon_ExceL{
	@Test
	public void Excel_demo() throws IOException {
		
		String file_path="./Testdata/testdata.xlsx";
		
		FileInputStream fis = new FileInputStream(file_path);
		
		//create object for property
		Workbook book = new XSSFWorkbook(fis);
		
		//Access the sheet
		Sheet sheet = book.getSheet("sheet1");
		
		//Access the row and cell
		String value = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
			
	}	
}
