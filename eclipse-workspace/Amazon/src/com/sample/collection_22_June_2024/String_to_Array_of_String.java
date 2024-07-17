package com.sample.collection_22_June_2024;

import java.util.HashMap;
import java.util.Map;

public class String_to_Array_of_String 
{

	public static void main(String[] args) 
	{
		String stu = "Rodger:1, Novak:2, Rafel:3";
		
		Map<String, String> map=new HashMap<String, String>();
		
		//split the string by ,
		
		String student[] = stu.split(" ");
		
		// iterate the parts and add them to a HashMap
		for(String strParts : student)
		{
            // split the student data by colon to get the 
            // name and roll number 
			String stuData[] = strParts.split(":");
			
			String stuRollNum = stuData[0].trim();
			String stuName = stuData[1].trim();
			
			map.put(stuName, stuRollNum);
			
		}
		
		System.out.println(map);

	}

}
