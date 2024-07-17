package com.java.Final_1_June_2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Read_Data_From_Excel 
{
	static WebDriver driver;

	public static void main(String[] args) throws IOException 
	{
		String excelFile = ".\\datafiles\\Test_Project_Data.xlsx";
		
		FileInputStream inputFIS=new FileInputStream(excelFile);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputFIS);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//read using loop
		//first we need to get num of row and column
		
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=row;r++) //row
		{
			XSSFRow firstRow = sheet.getRow(r);
			for(int c=0;c<=col;c++)// col
			{
				XSSFCell cell = firstRow.getCell(c);
				
				switch(cell.getCellType())
				{
				case STRING : System.out.println(cell.getStringCellValue());
				break;
				
				case NUMERIC : System.out.println(cell.getNumericCellValue());
				break;
				
				case BOOLEAN : System.out.println(cell.getBooleanCellValue());
				break;
				
				
				}
			}
			
			System.out.println();
		}

	}

}
