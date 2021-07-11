package oopsConcept;

public class Wrapperclass 
{
	String a="100";
	String b="200.020";
	String c="300";

	public static void main(String[] args) 
	{
		Wrapperclass wc=new Wrapperclass();
		//change to Integer
		int i=Integer.parseInt(wc.a);
		System.out.println(i+100);
		
		//double
		double d=Double.parseDouble(wc.b);
		System.out.println(d+100);

	}

}
