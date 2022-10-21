package week3day2;

import java.util.Arrays;
import java.util.LinkedList;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		LinkedList <Integer> list1=new LinkedList <Integer>();
		LinkedList <Integer> list2=new LinkedList <Integer>();
		for(int i=0;i<a.length;i++) {
			list1.add(a[i]);	
		}
		for(int j=0;j<b.length;j++) {
			list2.add(b[j]);	
		}
		System.out.println(list1);
		System.out.println(list2);
		for(int k=0;k<a.length;k++) {
			for(int l=0;l<b.length;l++) {
				if(a[k]==b[l]) {
					System.out.println(a[k]);
				}
			}
		}
	}

}
