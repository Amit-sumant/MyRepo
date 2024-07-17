package com.java.Basic_To_End;

public class String_Method {

	public static void main(String[] args) 
	{
		String s = "Welcome";
		String s1 = " Java";
		
		//concat method
		System.out.println(s.concat(s1));
		
		//trim method
		String aa = "   Welcome Java ";
		System.out.println("After Method -> " +aa.trim());
		System.out.println("Before Method -> " + aa);
		
		
		//charAT method : returns the character value at given index
		
		String ss = "Thiruananthpuram welcome";
		
		System.out.println("Your Character value at -> " + ss.charAt(8));
		
		//Replace method
		
		System.out.println(ss.replace('i', 'e'));
		
		//replace character
		System.out.println(ss.replace("welcome", "bye"));
		
		//substring method
		
		System.out.println("---------------------------------------------");
		
		System.out.println(ss.substring(8, 11));
		

	}

}
