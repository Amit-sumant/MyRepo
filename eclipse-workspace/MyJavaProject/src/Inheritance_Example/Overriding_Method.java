package Inheritance_Example;

public class Overriding_Method 
{

	public static void main(String[] args) 
	{
		SBI sbi=new SBI();
		System.out.println(sbi.rateofInt());
		
		ICICI ic=new ICICI();
		System.out.println(ic.rateofInt());
		
		HDFC hdfc=new HDFC();
		System.out.println(hdfc.rateofInt());

	}

}

class Bank
{
	double rateofInt()
	{
		return 10;
	}
}

class SBI extends Bank
{
	double rateofInt()
	{
		return 9;
	}
}
class ICICI extends Bank
{
	double rateofInt()
	{
		return 8;
	}
}
class HDFC extends Bank
{
	double rateofInt()
	{
		return 11;
	}
}