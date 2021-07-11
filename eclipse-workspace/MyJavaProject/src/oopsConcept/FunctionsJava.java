package oopsConcept;

public class FunctionsJava {

	public static void main(String[] args) 
	{
		System.out.println("Hello");
		FunctionsJava obj=new FunctionsJava();
		
		//System.out.println("ABC Method output is :" + obj.abc());
		int l = obj.abc();
		System.out.println(l);
		
		String s1=obj.xyz();
		System.out.println(s1);

	}
	
	public int abc()
	{
		System.out.print("This is ABC:-");	
		int a=700;
		int b=800;
		int c=a+b;
		
		return c;
	}
	
	public String xyz()
	{
		System.out.print("This is String:-");
		String s="My Name is Selenium";
		return s;
	}
	

}
