package javaBasic;

public class TwoDimensionArray 
{

	public static void main(String[] args) 
	{
		String x[][] = new String[4][4];
		System.out.println(x.length); //this gives total num of rows
		System.out.println(x[0].length); //this gives total num  of column
		
		x[0][0] = "A";
		x[0][1] = "M";
		x[0][2] = "I";
		x[0][3] = "T";
		
		x[1][0] = "W";
		x[1][1] = "A";
		x[1][2] = "N";
		x[1][3] = "T";
		
		x[2][0] = "C";
		x[2][1] = "H";
		x[2][2] = "N";
		x[2][3] = "G";
		
		x[3][0] = "C";
		x[3][1] = "H";
		x[3][2] = "N";
		x[3][3] = "G";
		
		//System.out.println(x[0][0]);
		
		//Below is to Print all the 2D array
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.print(x[row][col]);
			}System.out.print(" ");
		}
	}

}
