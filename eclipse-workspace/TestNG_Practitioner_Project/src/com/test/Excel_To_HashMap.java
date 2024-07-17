package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_To_HashMap 
{

	public static void main(String[] args) throws IOException 
	{
		//create a empty workbook
		XSSFWorkbook workbook=new XSSFWorkbook();
		//create new sheet
		XSSFSheet sheet = workbook.createSheet("Employee_Data");
		
		HashMap<Integer, String> mapdata=new HashMap<Integer, String>();
		mapdata.put(1010, "A");
		mapdata.put(1011, "B");
		mapdata.put(1012, "C");
		mapdata.put(1013, "D");
		mapdata.put(1014, "E");
		mapdata.put(1015, "F");
		mapdata.put(1016, "G");
		
		int rowno=0;
		
		for(Entry<Integer, String> entry : mapdata.entrySet())
		{
			//create new Row
			XSSFRow row = sheet.createRow(rowno++);
			
			//now we have to store into first cell
			row.createCell(0).setCellValue((Integer)entry.getKey());
			row.createCell(1).setCellValue((String)entry.getValue());
		}
		
		//now store in a file
		FileOutputStream fos=new FileOutputStream(".\\Data_Files\\Employee_Data.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("File created successfully");

	}

}
