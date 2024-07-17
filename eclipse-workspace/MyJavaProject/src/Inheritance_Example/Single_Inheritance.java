package Inheritance_Example;

public class Single_Inheritance
{
	public static void main(String[] args)
	{
		
		B obj1=new B();
	
		obj1.a = 100;
		obj1.b = 200;
		
		obj1.display();
		obj1.print();
				
	}
}

class A
{
	int a;
	
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	
	void print()
	{
		System.out.println(b);
	}
}
