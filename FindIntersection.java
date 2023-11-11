package Week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> number1 = new ArrayList<Integer>();
		List<Integer> number2= new ArrayList<Integer>();
		int[] array1= {3, 2, 11, 4, 6, 7};
		int[] array2= {1, 2, 8, 4, 9, 7};
		for(int each:array1) {
			number1.add(each);
		}
		Collections.sort(number1);
		System.out.println(number1);
		for(int each:array2) {
			number2.add(each);
		}
		Collections.sort(number2);
		System.out.println(number2);
		System.out.println(number1.size());
		System.out.println(number2.size());
		List<Integer> number3= new ArrayList<Integer>();
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
			if( number1.get(i).equals(number2.get(j))) {
				number3.add(number2.get(j));
			}
			
			}
			
	/*	for(int i=1; i<6;i++) {
			for(int j=1; j<6;i++){
				if(number1.get(i).equals(number2.get(j))) {
					System.out.println(number3.add(number1.get(i)));
					}
				}*/
		
			
					
			
		}
		System.out.println(number3);
				
		}
}

		

