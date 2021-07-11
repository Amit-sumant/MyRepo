package javaInterviewCoding;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int a=100;
		int b=500;
		int tmp;
		
		System.out.println("Before swap of a is ->" + a + "\n" + "Before swap of b is ->" + b);
		
		System.out.println("-----------After Swap----------------");
		
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("After swap of a is ->" + a + "\n" + "After swap of b is ->" + b);
		
		System.out.println("-------------------------------Without using 3rd variable----------------------------------");
		
		int i = 500;
		int j = 600;
		
		System.out.println("Value before SWAP = " + i +" " + j);
		
		i = i+j; //1100
		j = i-j;
		i = i-j;
		
		System.out.println("Value after SWAP = " + i +" " + j);
	}

}
