package com.java.ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		String excelPath = ".\\Data_Files\\Countrydata.xlsx"; //for this exl file
		
		FileInputStream input=new FileInputStream(excelPath);//we open the stream File
		
		XSSFWorkbook workbook = new XSSFWorkbook(input); // and we got the workbook
		//XSSFSheet sheet = workbook.getSheet("Sheet1"); //here we get the sheet. Return sheet object
		XSSFSheet sheet = workbook.getSheetAt(0); //eithr we can use getSheet or getSheetAt method
		
		//read data using FOR Loop
		int row = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<=row; r++)
		{
			XSSFRow xrow = sheet.getRow(r); //get row object
			
			for(int c=0; c<cols; c++)
			{
				XSSFCell xcel = xrow.getCell(c);
				
				switch(xcel.getCellType())
				{
				case STRING: System.out.print(xcel.getStringCellValue());
			break;
				case NUMERIC: System.out.print(xcel.getNumericCellValue());
			break;
				case BOOLEAN: System.out.print(xcel.getBooleanCellValue());
			break;
				default:
					break;
				
				}
				System.out.print( " | ");
			}
			System.out.println();
		}
		
		//Using Iterator
		
		/*Iterator it = sheet.iterator(); //return all row and iterate
		
		while(it.hasNext())
		{
			XSSFRow xrow = (XSSFRow) it.next();
			
			Iterator cellIte = xrow.cellIterator();
			
			while(cellIte.hasNext())
			{
				XSSFCell cell = (XSSFCell) cellIte.next();
				
				switch(cell.getCellType())
				{
					case STRING: System.out.print(cell.getStringCellValue());
					break;
					case NUMERIC: System.out.print(cell.getNumericCellValue());
					break;
					case BOOLEAN: System.out.print(cell.getBooleanCellValue());
					break;
				
				}
				System.out.print(" | ");
			}
			System.out.println();*/
		}

	}
