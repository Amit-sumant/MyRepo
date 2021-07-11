package oopsConcept2;

public class TestCar 
{

	public static void main(String[] args) 
	{
		//compile time Polymorphism or static polymorphisam
		BMWCar bc=new BMWCar();
		Jaguar jj=new Jaguar();
		bc.Start();
		bc.Stop();
		bc.AutoStart();
		bc.AutoStart();
		jj.Start();
		
		Car cc=new Car();
		cc.engine();
		cc.refuel();
		
		
		Car c=new Car();
		c.Start();
		c.Stop();
		c.refuel();
		
		Vehicle v=new Vehicle();
		v.Powerwheel();
		

	}

}
