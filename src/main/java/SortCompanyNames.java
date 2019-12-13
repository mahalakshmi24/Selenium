package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCompanyNames {

	public static void main(String[] args) {
				
		List<String> CompanyNames = new ArrayList<>();
		System.out.println(CompanyNames.isEmpty());
		CompanyNames.add("HCL");
		CompanyNames.add("Aspire Systems");
		CompanyNames.add("CTS");
		
		System.out.println("Size "+CompanyNames.size());
		
		//To Sort a List
		Collections.sort(CompanyNames);
		//To reverse a List, but has to be used after sort
		Collections.reverse(CompanyNames);
		
		for (String eachBrowser : CompanyNames) {
			System.out.println(eachBrowser);
		}
}
}
