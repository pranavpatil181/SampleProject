package main.java.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelFile {
	
	public String getData(String fileName, String sheetName) throws IOException {
	
	String result="";
		
	File file = new File(System.getProperty("user.dir")+File.separator+"Testdata"+File.separator+fileName);
	FileInputStream inputStream = new FileInputStream(file);
	Workbook excel= null;
	String fileExtensionName = fileName.substring(fileName.indexOf("."));
	
	if(fileExtensionName.equals(".xlsx")){
		excel = new XSSFWorkbook(inputStream);
	}
	else if (fileExtensionName.equals(".xls")) {
		excel = new HSSFWorkbook(inputStream);
	}
	
	Sheet sheet = excel.getSheet(sheetName);
	int rowCount =sheet.getLastRowNum()-sheet.getFirstRowNum();
	
	for (int i = 0; i < rowCount+1 ; i++) {
		Row row =sheet.getRow(i);
		
		
		for (int j = 0; j < row.getLastCellNum(); j++) {
			System.out.print(row.getCell(j).getStringCellValue()+"|| ");
		}
		System.out.println();
	}
	
	
	return result;
	}
}
