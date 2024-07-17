package com.java.ExcelSheet;

import java.io.File;

public class file {

	public static void main(String[] args) 
	{
		/*File file=new File("C:\\Users\\DELL\\Documents\\Dictoonery");
		
		File[] listfile = file.listFiles();
		
		for(File files : listfile)
		{
			if(files.isFile())
			{
				System.out.println(files.getName());
			}
		}*/
		
		//create file object
		File file=new File("C:\\Users\\DELL\\Documents\\Dictoonery");
		
		//list of all file
		String[] listfiles = file.list();
		
		System.out.println(listfiles);
		
		for(int i=0;i<listfiles.length;i++)
		{
			System.out.println(listfiles[i]);
		}

	}

}
