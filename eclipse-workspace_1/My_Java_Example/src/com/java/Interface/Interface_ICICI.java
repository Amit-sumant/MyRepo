package com.java.Interface;

public class Interface_ICICI implements Interface_HDFC_Bank, Interface_RBI
{

	public void debit() 
	{
		System.out.println("This is method override from RBI Interface for Debit");
	}

	public void credit() 
	{
		System.out.println("This is method override from RBI Interface for Credit");
		
	}

	public void transferMonery() 
	{
		System.out.println("This is method override from RBI Interface for Transfer Money");
	}


	public void eduLoan()
	{
		System.out.println("This is method override from RBI Interface for Education Loan");
	}


	public void homeLoan() 
	{
		System.out.println("This is method override from RBI Interface for Home Loan");
	}

}
