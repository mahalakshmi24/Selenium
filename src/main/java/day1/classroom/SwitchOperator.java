package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=2;
		int b=3;
		

		// Declare a String variable with input as operations (Tip:
		String operation="add";
		int c;
		// Initiate switch case for operations
		
		switch(operation)
		{	// Within switch, include as case for add operation
		case "add":
			c=a+b;
			System.out.println("addition of a and b is " +c);
			break;
		case "sub":
			c=a-b;
			System.out.println("Subtaction of and b is " +c);
			break;
		case "multiply":
			c=a*b;
			System.out.println("Multiplicaiton of and b is " +c);
			break;
		case "div":
			c= a/b;
			System.out.println("Division of a and b is " +c);
			break;
		default:
			System.out.println("no output");
		break;
		}
		
		
			
			
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
