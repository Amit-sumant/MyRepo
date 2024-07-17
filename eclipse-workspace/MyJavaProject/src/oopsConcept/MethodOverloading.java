package oopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading mo=new MethodOverloading();
		mo.subtract();
		mo.subtract(50);
		mo.subtract(100, 933);
	}
	
	public void subtract()
	{
		System.out.println("This is 0 parameter--");
	}
	
	public void subtract(int i)
	{
		System.out.print("This is 1 parameter--");
		System.out.println(i);
	}
	
	public void subtract(int i, int j)
	{
		System.out.print("This is 2 parameter--");
		System.out.println(i+j);
	}

}
