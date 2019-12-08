package week3.day6.classroom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		
		String name= "mahalakshmi";
		char[] nameArray = name.toCharArray();
		int count =0;
		Map<Character, Integer> map= new LinkedHashMap<>();
		for(int i=0; i<nameArray.length; i++)
		{
			if(map.containsKey(nameArray[i]))
			{	
//				count =count+1;
				map.put(nameArray[i], map.get(nameArray[i])+1);
				//map.get(nameArray[i+1]);
				
			}
			else
			{
				map.put(nameArray[i],1);
//				count=1;
			}
			
		}
		System.out.println(map);
	}
}
