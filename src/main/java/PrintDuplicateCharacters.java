package week3.assignments;

import java.util.*;

public class PrintDuplicateCharacters {
	public static void main(String[] args) {
		
	
	String input= "Infosys Limited";
	List<Character> list = new ArrayList<Character>();
	Set<Character> set= new LinkedHashSet<Character>();
	for (char eachchar :input.toCharArray())
	{
		
		if(set.contains(eachchar))
		{
			list.add(eachchar);
		}
		
		else
		{
			set.add(eachchar);
		}
		
	}
		System.out.println("Repeated characters are " +list);
		System.out.println(set);
	

	}
}
