package Week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List <String> companyName = new ArrayList<>();
		List <String> b = new ArrayList<>();
		companyName.add("Wipro");
		companyName.add("HCL");
		companyName.add("CTS");
		companyName.add("Aspire Systems");
		Collections.sort(companyName);
		System.out.println(companyName);
		int a=companyName.size()-1;
		for(int i=a;i>=0;i--) {
			System.out.println(companyName.get(i));
			
		}
		

	}

}
