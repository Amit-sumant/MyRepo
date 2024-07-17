package oopsConcept;

public class FinalFinallyandFinalize {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		exceptiontry();

	}

	public static void exceptiontry() throws Exception {
		try {
			int i = 100;

			System.out.println("Inside Try");
			int k = i / 0;
			System.out.println(k);
		}
			
		 catch(ArithmeticException e)
		{ 
			 System.out.println("Inside Catch Block");
		}
		
		catch(Exception e)
		{ System.out.println("Inside Catch Block 1"); }
		
		 
		finally {
			System.out.println("Inside Finally block");
		}
	}

}
