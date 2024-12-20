package codingchallenges;
import java.util.Scanner;
public class Codingchallengesnestedif {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		if(score>35 && score<=60) {
			System .out.println("i can get video games");
		}
		else if(score>60 && score<=90) {
			System .out.println("i can get iphone");
		}
		else if(score>90){
			System .out.println("i can get MacBook pro");
		}
		else {
			System .out.println("Fail");
		}
	}

}
