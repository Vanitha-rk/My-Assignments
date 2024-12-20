package codingchallenges;

 import java.util.Scanner;
public class Codingchallengesevenornot {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
