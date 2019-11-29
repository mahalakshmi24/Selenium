package week1.assignments;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// Here is the input 
				int[] arr1 = {3,2,11,4,6,7};
				int[] arr2 = {1,2,8,4,9,7};
				
				//Build a logic to identify the intersection between given arrays
				
				/* Pseudo Code: 
				 * 1)Traverse through each array item for each given array (use nested for loop)
				 * 2)Compare both the arrays 
				 * 3) Print the matching item
				 */

				int count=0;
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				for(int i=0; i<=arr1.length-1;i++)
				{
					for(int j=0; j<=arr2.length-1; j++)
					{
						if(arr1[i]==arr2[j])
						{
							count=count+1;
							System.err.println(arr2[j]);
						}
					}
				}
	}

}
