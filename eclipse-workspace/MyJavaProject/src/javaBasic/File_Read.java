package javaBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Read {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// Read Text file
		
		FileReader fr=null;
		
		fr=new FileReader("E:\\ms office account.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		Thread.sleep(5000);

	}

}
