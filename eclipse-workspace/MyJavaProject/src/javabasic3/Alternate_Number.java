package javabasic3;

public class Alternate_Number 
{

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int i = arr.length;
		
		for(int j=0;j<arr.length;j=j+2)
		{
			System.out.print(arr[j] + " ");
		}
		
		System.out.println();
		System.out.println("*********************************************");
		
		//Print alternate String
		
		String[] str = {"A","B","C","D","E","F","G"};
		
		System.out.println(str.length);
		
		for(int k=0;k<str.length;k=k+2)
		{
			System.out.print(str[k] + " ");
		}
		
		System.out.println();
		System.out.println("*********************************************");
		
		String stt = "Hi This is Java";
		
		String[] ch = stt.split(" ");
		
		for(int a=0;a<ch.length;a++)
		{
			if(a%2!=0)
			{
				System.out.println(ch[a]);
			}
		}
		
		
	}

}
