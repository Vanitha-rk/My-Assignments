package codingchallenges;

import java.util.Scanner;
public class Divisibleby3and5 {
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number:");
		int value=scan.nextInt();
		
		if(value%3==0 && value%5==0) {
			System.out.println("The given number divisible by 3 & 5");
		}
		else {
			System.out.println("The given number is not divisible by 3 & 5");
		}
	}

}
