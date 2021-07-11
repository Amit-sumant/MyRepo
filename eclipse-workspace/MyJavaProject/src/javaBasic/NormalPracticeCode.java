package javaBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NormalPracticeCode
{	
	Map inputmap;
	
	
	NormalPracticeCode(Map outmap)
	{
		this.inputmap= outmap;
	}
	
	public static void main(String[] args)
	{
		/*“FName=Isaac|LName=Newton|Address=UK|Age= |School=Trinity|Invention=LawsOfMotion”
				Read above as a string and write the program using collection framework classes to print values as mentioned below. Do no use replace method of String.
				Output: FName : Issac , LName : Newton , Address : UK And so on….*/
		Map<String, String> mymap = new HashMap<>();
		mymap.put("Fname", "Amit");
		mymap.put("Lname", "Sumant");
		mymap.put("Address", "UK");
		mymap.put("Age", "39");
		
		NormalPracticeCode np=new NormalPracticeCode(mymap);
		System.out.println("Input Map of String " + np.inputmap.toString());
		
		System.out.println("Address " + np.inputmap.get("Address"));	
	}

}
