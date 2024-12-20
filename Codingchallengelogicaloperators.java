package codingchallenges;

import java.util.Scanner;

public class Codingchallengelogicaloperators {
	public static void main (String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
	//	boolean rem1=(num%3==0);
	//	boolean rem2=(num%5==0);
		
		if(num%3==0 && num%5==0) {
			System.out.println("The number is divisible by 3 & 5");
		}
		else {
			System.out.println("The number is not divisible by 3 & 5");
		}
	}

}
