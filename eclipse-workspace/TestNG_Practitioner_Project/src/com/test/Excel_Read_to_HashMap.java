package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_to_HashMap 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		//Read from Excel to Hashmap
		
		FileInputStream fis=new FileInputStream(".\\Data_Files\\Employee_Data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.getSheet("Employee_Data");
		
		//find number of rows
		
		int rows=sheet.getLastRowNum();
		
		HashMap<Integer, String> mapdata=new HashMap<Integer, String>();
		
		//Reading data from eccel to hashmap
		
//		for(int r=0;r<=rows;r++)
//		{
//			Integer key = sheet.getRow(r).getCell(0).getStringCellValue();
//			String val = sheet.getRow(r).getCell(1).getStringCellValue();
//			
//			mapdata.put(key, val);
//		}
//		
//		for(Map.Entry entry : mapdata.entrySet())
//		{
//			
//		}

	}

}
