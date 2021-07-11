package interfaceJava;

public class BarclaysBank implements AmericanBank, IndianBank
{
	//Is-A relationship mens Interface and Class Relationship. * Interview question
	
	public void Credit()
	{
		System.out.println("Money Credited");
	}
	
	public void Debit()
	{
		System.out.println("Money Debited");
	}
	
	public void FoodCard()
	{
		System.out.println("Foodcard avail");
	}
	
	public void Houseloan()
	{
		System.out.println("House Loan Facility Avail");
	}
	
	public void MutualFund()
	{
		System.out.println("Mutual Fund Avail");
	}

}
