package javaInterviewCoding;

public class SwapTwoString {

	public static void main(String[] args) {
		// SWAP string without using temp or third variable
		
		String a = "Hello";
		String b = "Java";
		
		System.out.println("String value before swap = " + a + " " + b);
		
		//append string value
		a=a+b;
		System.out.println("String value before swap = " + a);
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("String value after swap = " + a + " " + b);
		
		System.out.println("---------------------Using third variable------------------");
		
		String c = "Java";
		String d = "Programming";
		String tmp;
		
		tmp=c+d;
		
		System.out.println("Temp is -> " + tmp);
		
		tmp = c;
		c = d;
		d = tmp;
		
		System.out.println("Value of swap = " + c +" " + d);
		

	}

}
