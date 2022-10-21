package week3day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> s=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			
			
			if(!s.add(data[i])) { 
        		System.out.println(data[i]);
        	}
        }
		}
		
		
		
	}


