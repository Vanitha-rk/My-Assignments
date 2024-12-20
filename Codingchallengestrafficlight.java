package codingchallenges;
import java.util.Scanner;

public class Codingchallengestrafficlight {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String Color=scan.nextLine();
		if(Color.equals("red")) {
			System.out.println("Stop");
		}
		else if(Color.equals("yellow")){
			System.out.println("Get Ready");
		}
		else if(Color.equals("Green")) {
			System.out.println("Go");
		}
	}

}
