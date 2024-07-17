package com.java.AbstractMethod;

public class TestBank {

	public static void main(String[] args) 
	{
		HDFCBank hdfc=new HDFCBank();
		hdfc.credit();
		hdfc.debit();
		hdfc.loan();
		hdfc.eduLoan();
		
		abstractMethod ab=new HDFCBank();
		ab.credit();
		ab.debit();
		ab.loan();

	}

}
