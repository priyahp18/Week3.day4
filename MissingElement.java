package Week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> a= new ArrayList<Integer>();
		int b=a.size()-1; 
		List<Integer> c= new ArrayList<Integer>();
		for(int each:number) {
			a.add(each);
		}
		Collections.sort(a);
		System.out.println(a);
		for(int i=0;i<b;i++) {  
			if(a.get(i+1)-a.get(i) !=1) {  
				c.add(a.get(i)+1); 
			}	
		}
		System.out.println(c);		
		}
	}	


