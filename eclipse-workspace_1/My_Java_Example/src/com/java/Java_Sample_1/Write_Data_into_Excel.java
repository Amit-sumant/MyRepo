package com.java.Java_Sample_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_into_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter file=new FileWriter("E:\\Amit.txt");
		
		BufferedWriter bf=new BufferedWriter(file);
		
		bf.write("Selenium with Java");

		bf.write("Gen AI");

		bf.write("Web Developer");
		
		System.out.println("Finished");
		
		bf.close();

	}

}
