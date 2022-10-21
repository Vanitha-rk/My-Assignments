package week3day2;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> n=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{	
			n.add(data[i]);
		}
			LinkedList <Integer> llist=new LinkedList<Integer>(n);
			System.out.println(llist);
			int size = llist.size();
		    System.out.println("Second largest number: " +llist.get(size-2));
		    	}

}
		