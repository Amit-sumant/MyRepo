package handleDynamaicWebTable;

public class General_Java_Concept 
{
	static int i=10;
	static int j=20;
	static int sum=0;
	
	static void result()
	{
		//System.out.println(sum=i*j);
		
		System.out.println(sum = i * j);
		
		if(sum>100)
		{
			System.out.println("This value is below 100");
		}
		else
		{
			System.out.println("Greater Than 100");
		}
	}

	public static void main(String[] args) 
	{
		//General_Java_Concept jc=new General_Java_Concept();
		
		result();

	}

}
