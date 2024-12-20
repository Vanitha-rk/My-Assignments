package codingchallenges;
 import java.util.Scanner;
public class Codingchallenge2if {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int score=scan.nextInt();
		
		if(score<50) {
		 System.out.println("You need to improve");
		}
		else if(score>=50 && score<70) {
			System.out.println("Good Job");
		}
		else if(score>70) {
			System.out.println("Excellent Performance!");
		}
		else {
			System.out.println("Fail below 50");		}
	}

}
