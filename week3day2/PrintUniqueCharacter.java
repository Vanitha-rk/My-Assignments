package week3day2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
    String v="Vanitha";
    char[] c = v.toCharArray();
    System.out.println(c);
    Set<Character> s=new LinkedHashSet<Character>();
    for(int i=0;i<v.length();i++) {
    	
    	if(!s.add(c[i])) { 
    		char d = c[i];
    		s.remove(d);
    		
    	}	
    	}
 
    System.out.println(s);
    

    List<Character> list=new ArrayList<Character>(s);
    for (int i = 0; i < list.size(); i++) {
		
			System.out.print(list.get(i));
		}

    }
	}
    	
    
	


