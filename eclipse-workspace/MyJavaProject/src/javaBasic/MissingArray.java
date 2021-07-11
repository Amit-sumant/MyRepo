package javaBasic;

public class MissingArray 
{

	public static void main(String[] args) {
		  
		  int[] numbers = new int[] { 211, 212, 213, 214, 215, 217, 218, 219};
		  findMissingNumber(numbers);

		 }
		 
		 //Write a java program to find missing number in an array?
		 public static void findMissingNumber(int[] numbers) {
		  int arrayTotal = 0;
		  int missingTotal = 0;
		  int min = 0;
		  int max = 0;
		  
		  for(int i=0;i<numbers.length;i++) {
		   if(min == 0 )
		    min = numbers[i];
		   if(max == 0 )
		    max = numbers[i];
		   
		   if(min > numbers[i]) {
		    min = numbers[i];
		   }
		   
		   if(max < numbers[i]) {
		    max = numbers[i];
		   }
		   arrayTotal = arrayTotal + numbers[i];
		  }
		  
		  for(int i=min;i<=max;i++) {
		   missingTotal = missingTotal + i;
		  }
		 
		  System.out.println( missingTotal - arrayTotal);
		 }

}
