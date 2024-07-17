package com.sample.startpattern;

public class StarPattern2 {

	public static void main(String[] args) 
	{
		//     *
		//    **
		//   ***
		//  ****
		
/*		   *
          * *
         * * *
        * * * *
       * * * * *
      * * * * * *
     * * * * * * *
    * * * * * * * *
   * * * * * * * * *
  * * * * * * * * * *         */
		
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "); // if remove this space then we'll get first * pattern result
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//complete pyramid logic
		System.out.println("--------------------");
		
		for(int i=1; i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
				System.out.print("*");
			}
			
			
			for(int k=9;k>i;k--)
			{
				
				System.out.print(" ");
				
			}
			
			System.out.println();
		}
		

	}

}
