package oopsConcept;

public class Car {
	
	//below variables are called global variable as declared in Class
	int model;
	int wheel;

	public static void main(String[] args) 
	{
		Car a=new Car(); //a is called ref variable and new Car() called object
		Car b=new Car();
		Car c=new Car();
		
		a.model=2020;
		a.wheel=4;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		b.model=2019;
		b.wheel=4;
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		c.model=2018;
		c.wheel=4;
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		

	}

}
