package xlsReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class readerExcelData 
{
	public static void main(String[] args) throws IOException 
	{
		String strExcel = "/CucumberProject/src/main/java/xlsReader/Book1.xlsx";
	
		FileInputStream fis=new FileInputStream(strExcel);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
	}
}
