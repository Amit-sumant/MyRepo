package collectionOfJava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample2 {

	public static void main(String[] args) 
	{
		ArrayList<Object> obj=new ArrayList<>();
		obj.add("Java");
		obj.add("Selenium");
		obj.add("Python");
		obj.add("C#");
		
		ArrayList<Object> obj1=new ArrayList<>();
		obj1.add("C");
		obj1.add(".Net");
		obj1.add("Ruby");
		obj1.add("AWS#");
		
		obj.addAll(obj1);
		System.out.println(obj);
		
		System.out.println("*********************************************");
		
		obj.addAll(2, obj1);
		System.out.println(obj);
		
		System.out.println("*******************Remove odd numbers using Lambada**************************");
		
		ArrayList<Integer> intr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		intr.removeIf(num -> num%2 == 0);
		System.out.println(intr);
		
		
		System.out.println("*******************Remove even numbers using Lambada**************************");
		
		ArrayList<Integer> intr1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		intr1.removeIf(num -> num%2 == 1);
		System.out.println(intr1);
	}

}
