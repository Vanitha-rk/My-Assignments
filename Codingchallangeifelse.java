package codingchallenges;

import java.util.Scanner;

public class Codingchallangeifelse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int income=scan.nextInt();
		if(income>7000) {
			System.out.println("schlorship is available");
		}
		else {
			System.out.println("schlorship is not available");
		}
	}
}
