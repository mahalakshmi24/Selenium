package week1.assignments.optional;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// Declare a String text with the following value
				String text = "Tes12Le79af65";
				// Declare a int variable sum
				int sum = 0;
				
				//build a logic to get sum of all the digits from the given string
				
				/*
				 * Method 1
				 * Pseudo Code
				 * a) using replaceAll(), replace all the non-digits into ""
				 * b) Now, convert the String into array
				 * c) Iterate over the array and get each character
				 * d) Using Character.getNumericValue(), Change the char into int
				 * e) Add the values to sum & print
				 */
				
				String text1=text.replaceAll("[^\\d]", "");
				System.out.println(text1);
				char[] charArray = text1.toCharArray();
				for (int i=0; i<=charArray.length-1; i++)
				{
					//System.out.println(charArray[i]);
					int ch = Character.getNumericValue(charArray[i]);
					sum=sum+ch;
				}
				System.out.println("sum of numbers = "+sum);
				/*
				 * Method 2
				 * Pseudo Code
				 * a) Iterate an  array over the String
				 * b) Get each character and check if it is a number using Character.isDigit()
				 * c) Now covert char to int using Character.isDigit() and add it to sum
				 * d) Now Print the value
				 */

	}

}
