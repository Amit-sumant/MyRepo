package collectionOfJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExamaples {

	public static void main(String[] args) {
		// Arraylist is dynamic array
		
		ArrayList<Object> ar=new ArrayList<Object>();
		
		ar.add(100); ar.add("String"); ar.add(10.99); ar.add(100.198); ar.add(200); ar.add("Array");
		
		System.out.println("Your definted Array is --> " + ar);
		
		System.out.println("Your definted Array is --> " + ar.get(2));
		System.out.println("Your definted Array Size is --> " + ar.size());
		
		ar.add(400); ar.add(1000);
		System.out.println("Your definted Array Size is --> " + ar.size());
		
		//************IMP ********** Virtual Capacity of Array List
		
		//Virtual capacity of Array List is 10 by default but physical capacity is always 0
		
		//Generic array
		
		ArrayList<Integer> arg=new ArrayList<Integer>();
		
		arg.add(100); arg.add(1000); arg.add(10000); arg.add(100000); arg.add(1000000);
		
		System.out.println("Generia Array of Integer values are -> " + arg);
		
		//String array
		
		ArrayList<String> args1=new ArrayList<String>();
		
		args1.add("A"); args1.add("B"); args1.add("C"); args1.add("D");
		
		//iterate the array
		for(int i=0; i<args1.size(); i++) 
		{
			System.out.println("Your String Array is -> " + args1.get(i));
			
		}
		
		System.out.println("---------------------------------------------------------");
		
		//using for each loop
		for(String a : args1)
		{
			System.out.println(a);
		}
		
		//Lambda Function
		args1.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("---------------------Lambada------------------------------------");
		
		//using Iterator function
		//Iterator store all the value in mentioned variable like -> it
		Iterator<String> it=args1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("---------------------Array within Array------------------------------");
		
		ArrayList<Object> amit=new ArrayList<Object>(Arrays.asList(100,200,"Arnav",10.33,500));
		
		System.out.println(amit);
		
		
		System.out.println("---------------------Remove IF------------------------------");
		
		ArrayList<Integer> amit1=new ArrayList<Integer>(Arrays.asList(111,200,300,400,450,500,600,700,800,877,912));
		
		amit1.removeIf(num -> num % 2 != 0);
		System.out.println(amit1);
		
		System.out.println("---------------------Remove IF------------------------------");
		
		ArrayList<Integer> amitarray=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		amitarray.removeIf(num -> num % 2 == 0);
		System.out.println(amitarray);
		
		System.out.println("---------------------Remove IF------------------------------");
		
		System.out.println("---------------------Retain------------------------------");
		
		ArrayList<Integer> arrlist=new ArrayList<Integer>(Arrays.asList(10,1,2,3,4,10,5,6,7,8,9,10));
		
		arrlist.retainAll(Collections.singleton(10));
		
		System.out.println(arrlist);
		
	}

}
