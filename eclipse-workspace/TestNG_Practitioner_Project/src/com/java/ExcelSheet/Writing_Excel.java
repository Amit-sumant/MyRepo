package com.java.ExcelSheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		// Create Workbook --> Sheet --> Rows --> Cell
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		//using this workbook we need to create a sheet
		XSSFSheet sheet=workbook.createSheet("Emp Info");
		
		Object empdata[][]= {	{"EMP Id","Name","Surname","Job"},
				
									{1,"Arnav","Sumant","Space Scientish"},
									{2,"Tanush","Chinchwadkar","Engineer"},
									{3,"Srinika", "Chindhade","Doctor"},
									{4,"Anvi", "Chinchwadkar","Dancer"},
									{5,"Divyesh","Mardikar","Engineer"},
									{6,"Aavni","Paranjape","Engineer"},
							};
		
		//Using For Loop
		
		int row = empdata.length;
		int cols = empdata[0].length;
		
		System.out.println(row);
		System.out.println(cols);
		
		for(int r=0;r<row;r++)
		{
			XSSFRow xrow = sheet.createRow(r); //create a row
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell xcell = xrow.createCell(c);
				
				Object value = empdata[r][c];
				
				if(value instanceof String)
				xcell.setCellValue((String)value);
				
				if(value instanceof Integer)
					xcell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					xcell.setCellValue((Boolean)value);
			}
		}
		
		String filePath=".\\Data_Files\\employee.xlsx";
		FileOutputStream outstream=new FileOutputStream(filePath);
		workbook.write(outstream);
		
		outstream.close();
		
		System.out.println("Employee File created successfully");

	}

}
