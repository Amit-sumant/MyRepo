package oopsConcept;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SampleProg {
	
	//series of number separated by ,
	//number could be 1 to 5 digit
	//also print occurrence of number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(5);
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		al.add(i);
		//System.out.println(al.toString());
		System.out.println(al.get(i));
		
		System.out.println("****************************");
		
		//jdk stream with 8: String with using Lambda
		
		al.stream().forEach(element -> System.out.println(element));
		
		System.out.println("****************************");
		
		//using Iterator
		java.util.Iterator<Integer> ii=al.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}

	}

}
