package Inheritance_Example;

public class Hierarchial_Inheritance 
{

	public static void main(String[] args) 
	{
		child c1=new child();
		c1.i=10;
		c1.display();
		c1.print();
		
		child1 c2=new child1();
		c2.i=10;
		c2.k=30;
		c2.display();
		c2.show();

	}

}

class Parent
{
	int i=10;
	
	void display()
	{
		System.out.println("THis is Parent -" + i);
	}
}

class child extends Parent
{
	int j=20;
	
	void print()
	{
		System.out.println("This is child of Parent -" + j);
	}
}

class child1 extends Parent
{
	int k=30;
	
	void show()
	{
		System.out.println("This is child of Parent -" + k);
	}
}

class child2 extends Parent
{
	int l=40;
	
	void implement()
	{
		System.out.println("This is child of Parent -" + l);
	}
}
