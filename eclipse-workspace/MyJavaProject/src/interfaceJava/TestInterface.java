package interfaceJava;

import java.util.Scanner;

public class TestInterface 
{

	public static void main(String[] args) 
	{
		int i=AmericanBank.minbal;
		System.out.println(i);
		
		
		//can not create object of Parent Interface.
		BarclaysBank abn=new BarclaysBank();
		abn.Credit();
		abn.Debit();
		abn.FoodCard();
		abn.Houseloan();
		abn.MutualFund();
		
		//dynamoc poly - Child class can be referred by Parent interface reference variable
		AmericanBank brcl=new BarclaysBank();
		brcl.Credit();
		brcl.Debit();
		brcl.FoodCard();

	}

}
