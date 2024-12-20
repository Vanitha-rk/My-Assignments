package codingchallenges;
import java.util.Scanner;
public class Codingchallengeaverage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int num4=scan.nextInt();
		int num5=scan.nextInt();
		int total=num1+num2+num3+num4+num5;
		int average =total/5;
		System.out.println(average);
		if(average<35) {
			System.out.println("Additional class is required");
		}
		else {
			System.out.println("You are good to go");
		}
	}

}
