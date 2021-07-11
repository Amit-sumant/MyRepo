package javaBasic;

public class ReverseOrder 
{

	public static void main(String[] args) 
	{
		String s="Selenium Task";
		String rev = "";
		ReverseOrder ro=new ReverseOrder(); //created object for this class
		
		int len=s.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev + s.charAt(i);
			//System.out.println(rev);
			
		}
		System.out.println(rev);
		//System.out.println(ro.strBuffer(s));
		
		//Another way to reverse order using StringBuffer
		StringBuffer sb1=new StringBuffer(s);
		System.out.println(sb1.reverse());
		
		
		//Replace or remove characters
		String s2 = "!@#$%^Amit Selected 76877879";
		s2=s2.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s2);
		
		
	}
	/*private String strBuffer(String abc)
	{
		StringBuffer sb=new StringBuffer(abc);
		sb.reverse();
		return sb.toString();
		
	}*/

}
