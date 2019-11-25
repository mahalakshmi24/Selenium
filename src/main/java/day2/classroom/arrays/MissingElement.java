package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8};
		Arrays.sort(data);
		int l= data.length;
		int previous=0, next,following;
		
		for (int i=0; i<=l-1; i++)
		{
			previous=previous+data[i];
			next=data[i]+1;
			following=data[i+1];
			//System.out.println("Previous:::" + next);
			if(next!=following)
			{
				System.out.println("missing number  "+next);

			}
			
			
		}
		
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
		
		
		
		
		
		
		// Print the second largest number	
		
		
	}

}
