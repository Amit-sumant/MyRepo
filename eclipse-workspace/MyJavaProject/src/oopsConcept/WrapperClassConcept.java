package oopsConcept;

public class WrapperClassConcept {

	public static void main(String[] args) 
	{
		String x = "100";
		
		System.out.println(x+20);
		
		//using wrapper
		//parseINt - data conversion String to Int
		int i= Integer.parseInt(x);
		//int ii = Integer.parseInt(x);
		System.out.println(i+20);
		
		//string to double
		System.out.println("-----------------------string to double----------------------------");
		
		String s = "12.30";
		
		double d = Double.parseDouble(s);
		System.out.println(d+10);
	}

}
