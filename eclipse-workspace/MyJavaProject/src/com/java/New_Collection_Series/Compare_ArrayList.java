package com.java.New_Collection_Series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> nos=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		
		ArrayList<Integer> nos1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7));
		
		Collections.sort(nos);
		Collections.sort(nos1);
		
		System.out.println(nos.equals(nos1));
		
		//find out the missing number
		nos1.removeAll(nos);
		System.out.println(nos1);
		
		
	}

}
