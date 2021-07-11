package javaBasic;

public class duplicateCharactString 
{
	
	public static void main(String[] args) 
	{
		//duplicateCharactString obj=new duplicateCharactString();
		//obj.myArray();
		duplicateCharactString.myArray(); //This obj created because below method call as Static
		
		String str="Array Duplicate String";
		int cnt=0;
		
		char[] input=str.toCharArray();
		System.out.println("Duplicate array's are::");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(input[i]==input[j])
				{
					System.out.print(input[j]);
					cnt++;
					break;
				}
			}
		}
	}
			
			public static void myArray() 
			{
				int[] aa = {1,2,2,3,4,4,5,6,7,8,9};	
				
				for(int i1=0;i1<aa.length;i1++)
				{
					for(int j1=i1+1;j1<aa.length;j1++)
					{
						if(aa[i1] == aa[j1])
						{
							System.out.println(aa[i1]);
						}
					}
				}
			}
			
			
		
	}
