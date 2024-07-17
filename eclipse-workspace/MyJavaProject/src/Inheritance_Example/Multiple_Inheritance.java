 package Inheritance_Example;

 class A1
	{
		int x;
		
		void display()
		{
			System.out.println("This is Parent - " + x);
		}
	}
	
	class B1 extends A1
	{
		int y;
		
		void print()
		{
			System.out.println("This is Parent - " + y);
		}
	}
	
	class C extends B1
	{
		int z;
		
		void show()
		{
			System.out.println("This is Parent - " + z);
		}
	} 
 
public class Multiple_Inheritance 
{

	public static void main(String[] args) 
	{
		
		C oo=new C();
		oo.x=100;
		oo.y=1000;
		oo.z=10000;
		
		oo.display();
		oo.print();
		oo.show();
		
	}
	
}
