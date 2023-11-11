package Week3.day4;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class FindSecondLarge {

	public static void main(String[] args) {
		int[] array= {3, 2, 11, 4, 6, 7};
		List<Integer> a = new ArrayList<Integer>();
		for(int each:array) {
			a.add(each);
		}
		Collections.sort(a);
		System.out.println(a);
		int result = a.size()-2;
		System.out.println(a.get(result));
	}

}
