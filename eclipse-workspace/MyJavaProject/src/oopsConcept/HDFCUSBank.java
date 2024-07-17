package oopsConcept;

public class HDFCUSBank implements USbank 
{
	public void credit()
	{
		System.out.println("HDFC Credit");
	}
	
	public void debit()
	{
		System.out.println("HDFC debit");
	}
	
	public void transferwithinbank()
	{
		System.out.println("HDFC transfer");
	}
	
	public void transferexternalbank()
	{
		System.out.println("HDFC external transfer");
	}
	
	public void HigherEducationLoan()
	{
		System.out.println("HDFC HIgher Education Loan");
	}

}
