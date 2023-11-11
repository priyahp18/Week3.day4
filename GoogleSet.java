package Week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class GoogleSet {

	public static void main(String[] args) {
		//string
		String companyName = "google";
		//change string to char
		char[] a = companyName.toCharArray();
		// Initialize a set for char
		Set<Character> name = new LinkedHashSet<Character>(); 
		//add the char in set
		for(char name1: a) {
			name.add(name1);
			
		}
		//print the charc
		System.out.println(name);
	}

}
