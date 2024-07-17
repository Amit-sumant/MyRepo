package collectionOfJava;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		reverseString();

	}
	
	public static void reverseString()
	{
		/*int a[] =new int[5];
		a[0]=10; // 11 
		a[1]=20; // 22
		a[2]=30; //33
		a[3]=40;//44
		a[4]=50;
		
		int cnt=0;
		int len = a.length;
		
		for(int i=1;i<=len;i++)
		{
			System.out.println(a[i-1]+i);
		}
		
		//-----------Print alternate Number
		
		int[] arr= {5,7,8,9,6,1,5,3};
		
		int len = arr.length;
		
		for(int i=0;i<=len;i=i+2)
		{
			System.out.println(arr[i]);
		}*/
		
		//----Print alternate String
		
		String str="hello this is Java";
		
		String [] s = str.split("");
		
		int len = str.length();
		
		for(int i=0;i<len;i=i+2)
		{
			System.out.print(s[i]);
		}
		
		System.out.println("--------------------");
		
		String [] s1 = str.split(" ");
		int ln = s1.length;
		
		for(int j=1;j<ln;j=j+2) //
		{
			System.out.println(s1[j]);
		}
		
	}

}
