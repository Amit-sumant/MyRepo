package com.java.General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MIssing_Array {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7};
		int b[] = {1,3,5,7};
		boolean isPresent=false;
		int presentNum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			isPresent=false;
			presentNum=a[i];
			
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					isPresent=true;
				}
			}
			
			if(!isPresent)
			{
				System.out.println(presentNum);
			}
		}
		

	}

}
