package com.MyBatchProject.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	public ExcelDataProvider() throws IOException {
	String pathexcel=System.getProperty("user.dir")+"\\TestData\\LoginData.xlsx";
	File src=new File(pathexcel);
	FileInputStream fis=new FileInputStream(src);
    wb=new XSSFWorkbook(fis);
}
	public String getStringData(String SheetName, int row, int col) {
		return wb.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericData(String SheetName, int row, int col) {
		return wb.getSheet(SheetName).getRow(row).getCell(col).getNumericCellValue();
	}
}