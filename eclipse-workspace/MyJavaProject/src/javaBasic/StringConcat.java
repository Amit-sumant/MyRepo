package javaBasic;

public class StringConcat {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=100; int b=200;
		String x = "Hello";
		String y = "World";
		String z=x.concat(y);
		
		double d=10.50;
		double e=20.33;
		
		System.out.println("The Addition of Value is:"+ (a+b));
		System.out.println(x + y);
		
		//System.out.println(a+b+x+y);
		//System.out.println(x+y+ " " + a+b);
		//System.out.println("Output for this logic is = "+ x +" " + y +" " +(a + b));
		
		System.out.println("Output for this Logic is =" + a +" " + b +" " +x +" " + y +" " + a +" " + x +" " + b +" " + y);
		//System.out.println(a+b+x +" " + y +" " +a+x+b+y);
		
		//System.out.println(a+b+d+e);
		System.out.println(d+e+a+b);
		
		System.out.println(z);
	}

}
