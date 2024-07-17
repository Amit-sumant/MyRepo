package newCollectionofJava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodDemo {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(5);
		ar1.add(6);
		
		//ar.addAll(ar1);
		//System.out.println(ar);
		
		//ar1.addAll(ar);
		//System.out.println(ar1);
		
		ar.addAll(2, ar1); //to add value from particular index
		System.out.println(ar);
		
		System.out.println("*****************************from given arraylist remove even numbers. Use arrays.asList method*******************************");
		
		//from given arraylist remove even numbers. Use arrays.asList method
		ArrayList<Integer> areven = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		int num;
		if(areven.removeIf(num1 -> num1%2 == 0))
		{
			System.out.println(areven);
		}
		
		System.out.println("***************************from given arraylist remove even numbers. Use arrays.asList method*******************************");
		
		//from given arraylist remove odd numbers. Use arrays.asList method
		
		ArrayList<Integer> areven1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		
		if(areven1.removeIf(num2 -> num2 % 2 !=0 ))
		{
			System.out.println(areven1);
		}
		
	}

}
