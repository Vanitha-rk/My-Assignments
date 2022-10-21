package week3day1;


public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
        char[] ch = s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
          System.out.println(ch[i]);
          rev=rev+ch[i];
          
		}
        System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("Palindrome");
			
	}
		else
			System.out.println("Not a palindrome");
		
	}

	
}
