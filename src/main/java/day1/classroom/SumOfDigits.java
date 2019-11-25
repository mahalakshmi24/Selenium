package day1.classroom;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input number (int)
		int a= 123;
		

		// Initialize an integer variable by name: sum
		int sum=0;
		// Use loop to calculate the sum: which loop to use until the number goes less than 10??
		
		int m;
		
		while(a>0)    
		{    
		m=a%10;    
		sum=sum+m;    
		a=a/10;    
		}    
		// Within loop: get the remainder when done by 10 -> Tip: use mod
		System.out.println(sum);
			// Print the remainder to confirm
	
	}
			// Within loop: add that remainder to the sum
	
			// Print the sum to confirm
	
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
	
			// Print the quotient to confirm
		
		// Outside the loop: print the final sum
	}

