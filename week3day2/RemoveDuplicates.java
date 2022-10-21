package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="Paypal India";
		String st = s.toLowerCase();
		char[] c = st.toCharArray();
		Set<Character> charset =new TreeSet <Character>();
		Set<Character> dupcharset =new TreeSet <Character>();
		for(int i=0;i<s.length();i++) {
			if(charset.add(c[i])){
			}
			else {
				dupcharset.add(c[i]);
			}
			
		}		
		System.out.println(charset);
		System.out.println(dupcharset);
        charset.removeAll(dupcharset);
		
		System.out.println(charset);
		List<Character> list = new ArrayList<Character>(charset);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)!=' ') {
				System.out.println(list.get(i));
			}
		}
		

	
	}
	}

