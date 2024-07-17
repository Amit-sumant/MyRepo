package javabasic2;

public class ConvertStringtoCapitalizeString 
{
	
	public static String capitalizeString(String str)
	{
		if(str==null)
		{
			System.out.println("This is NULL value");
			return str;
		}
		
		String word[] = str.split("\\s"); // -> \ forward slash and second \ is escape character
		String result = "";
		
		for(String r : word)
		{
			String firstword = r.substring(0, 1).toUpperCase();// 0 means first word and 1 is second word. e.g. amit dhananjay sumant . //a d s
			String afterfirstwords = r.substring(1); // mit
			result = result + firstword + afterfirstwords + " "; 
			
		}
		
		//System.out.println(result);
		return result.trim();
	}

	public static void main(String[] args) 
	{
		String caps = capitalizeString("amit dhananjay sumant");
		System.out.println(caps);
		
		
		String caps1 = capitalizeString("arnav amit sumant");
		System.out.println(caps1);
		
		String caps2 = capitalizeString("123 arnav amit sumant");
		System.out.println(caps2);

	}

}
