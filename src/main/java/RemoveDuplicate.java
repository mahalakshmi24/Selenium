package week3.assignments;

import java.util.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
public static void main(String[] args) {
	
	String name= "PayPal India";
	char[] nameArray = name.toCharArray();
//	int count =0;
	Set<Character> uniqueset= new LinkedHashSet<>();
	List<Character> list = new ArrayList<>();
	for(int i=0; i<nameArray.length; i++)
	{
		if(uniqueset.contains(nameArray[i]))
		{	
//			count =count+1;
			list.add(nameArray[i]);
			//map.get(nameArray[i+1]);
			
		}
		else
		{
			uniqueset.add(nameArray[i]);
//			count=1;
		}
		
	}
	System.out.println(list);
	System.out.println(uniqueset);
	
	for (char eachletter : list) 
	{
	if(uniqueset.contains(eachletter))
			{
				uniqueset.remove(eachletter);
			}
		
	}
	
	System.out.println(uniqueset);
}
}
