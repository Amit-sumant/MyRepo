package oopsConcept;

public class TestInterface {

	public static void main(String[] args) 
	{
		HDFCUSBank hdfc=new HDFCUSBank();
		
		hdfc.credit();
		hdfc.debit();
		hdfc.HigherEducationLoan();
		hdfc.transferexternalbank();
		hdfc.transferwithinbank();

	}

}
