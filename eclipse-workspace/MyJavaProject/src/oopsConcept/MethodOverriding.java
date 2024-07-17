package oopsConcept;

public class MethodOverriding extends override
{
	//this is dynamic polymorphism
	
	public void run()
	{
		System.out.println("Run");
	}
	
	public void run1()
	{
		System.out.println("Run1");
	}
	
	public static void main(String args[])
	{
		override ride=new MethodOverriding();
		
		ride.run();
		//ride.run1();
	}

}

class override
{
	void run()
	{
		System.out.println("Override");
	}
}