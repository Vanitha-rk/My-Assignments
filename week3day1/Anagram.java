package week3day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if((text1.length())==(text2.length())){
			System.out.println("Both text have Same length");
		}
		
	    
		char[] charArray = text1.toCharArray();
		Arrays.sort(charArray);
		
		
		char[] charArray1 = text2.toCharArray();
		Arrays.sort(charArray1);
		
		
		if(charArray1.equals(charArray1))
		{
			System.out.println("It is anagram");
		}
		else
			System.out.println("It is not anagram");
		
		
		
	}

}
