package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */
		String[] words= text.split(" ");
		for (int i=0; i<=words.length-1; i++)
		{
			for (int j=i+1; j<words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					count= count+1;
					words[j]="";
					for(int k=0; k<words.length;k++)
					{
						System.out.print( words[k]+ " ");
					}
				}
			}
		}
}
}
