package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {


	public static void main(String[] args) {
    Integer [] numbers= {10,3,4,2,5,9,8,6,1};
    
    List<Integer> list=new ArrayList<Integer>(Arrays.asList(numbers));
	System.out.println(list);
    
    Set<Integer> llist=new TreeSet<Integer>(list);
	System.out.println(llist);
	LinkedList <Integer> list1=new LinkedList<Integer>(llist);
	for(int i=0;i<numbers.length;i++) {
		
	if(list1.get(i)==(i+1))
		{
		list1.get(i);
		
		}
	else {
	System.out.println("Missing number: " +(i+1));
	break;
	}
    }

}
}