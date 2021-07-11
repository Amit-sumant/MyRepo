package oopsConcept;

public class StaticNonStatic 
{
	String str="This is Static and Non Static Methis Learning";
	static int age=25;

	public static void main(String[] args) 
	{
		StaticNonStatic.method1();
		
		StaticNonStatic stic = new StaticNonStatic();
		stic.method();
		System.out.println(stic.str);
		
		
		System.out.println("age is=" + StaticNonStatic.age);
		
	}
	
	public void method()
	{
		System.out.println("This is non static");
	}
	
	public static void method1()
	{
		System.out.println("This is Static");
	}

}
