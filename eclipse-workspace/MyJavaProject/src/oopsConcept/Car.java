package oopsConcept;

public class Car 
{
	
	public static void main(String[] args) 
	{
		car1 cc=new car1();
		cc.methoda();
		cc.methodb();

	}
	
	public void methoda()
	{
		System.out.println("Hi");
	}
}

	class car1 extends Car
	{
		public void methodb()
		{
			System.out.println("Hi B");
		}
	}

	class car3 extends Car
	{

		public void car2()
		{
			System.out.println("Hiiiiiiiiiiiiiiiii");
		}

	}
