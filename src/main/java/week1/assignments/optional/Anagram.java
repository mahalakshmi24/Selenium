package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				int count=0;
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
				int l1=text1.length();
				int l2= text2.length();
				if(l1==l2)
				{
					char[] ch1=text1.toCharArray();
					char[] ch2=text2.toCharArray();
					Arrays.sort(ch1);
					Arrays.sort(ch2);
					for (int i=0; i<=l1-1; i++)
					{
						for (int j=0; j<=l2-1; j++)
						{
							if(ch1[i]==ch2[j])
							{
								count=count+1;								
							}
						}
					}
					if(count==l1)
					{
						System.out.println("Anagram");
					}
					else
					{
						System.out.println("words of same length");
					
					}
				}
				else
					System.out.println("not anagram");
	}

}
