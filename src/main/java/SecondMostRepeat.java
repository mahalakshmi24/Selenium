package week3.assignments;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostRepeat {
	public static void main(String[] args) {
		
		String input= "PayPalIndia";
		char[] nameArray = input.toCharArray();
//		int count =0;
		Map<Character, Integer> map= new LinkedHashMap<>();
		
		for(int i=0; i<nameArray.length; i++)
		{
			if(map.containsKey(input)) {
				map.put(nameArray[i], map.get(i)+1);
			}
			else
			{
				map.put(nameArray[i],  1);
			}
		}
		
		
		
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		
		//creating empty set to remove duplicates
		Set<Integer> count1 = new TreeSet<>();
		for(Entry<Character,Integer> eachentry : entrySet)
		{
			Integer value= eachentry.getValue();
			count1.add(value);
		}
		
		
		//create another list to give you key value pair
		
		List<Integer> listcount = new ArrayList<>(count1);
		System.out.println((listcount));
		
		int secondmost = listcount.size()-2;
		
		System.out.println(listcount.get(secondmost));
		
			
		
	}
}