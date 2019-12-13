package week3.assignments;
import java.util.*;

public class PrintDistinctCharacters {
	public static void main(String[] args) {
		
		String input= "Amazon India Private Limited";
		
		//List<String> eachchar = new ArrayList<>();
		Set<Character> eachchar = new LinkedHashSet<Character>();
		
		//char[] charArray = input.toCharArray();
		for (char eachletter : input.toCharArray())
		{
			eachchar.add(eachletter);
		}
		System.out.println(eachchar);
	}

}
