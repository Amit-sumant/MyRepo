package javaBasic;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringArraytoString 
{

	public static void main(String[] args) 
	{
		String arr[] = {"J","A","V","A"}; //so want result either JAVA or seperated by pipe or any other spl characters
		
		String jon = String.join("", arr);
		
		System.out.println("Your Join Output is -> " + jon);
		
		//2 way using arrays.aslist
		System.out.println("***************************************");
		
		String arr1 = Arrays.asList("J","A","V","A").stream().collect(Collectors.joining("|"));
		System.out.println("Your Join Output is -> " + arr1);

	}

}
