package week3day1;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] splits = text.split(" ");
		System.out.println(Arrays.toString(splits));
		for(int i=0;i<splits.length;i++)
		{
			
		for(int j=0;j<splits.length;j++) {
			
				if(splits[i].equals(splits[j])) {
					count++;
				}
				}
				if(count>1) {
		             text=text.replace(splits[i], "");
					}count=0;
		}
		        System.out.print(text);
		
	}
	}	

