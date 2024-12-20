package codingchallenges;

import java.util.Scanner;
public class Marksconvert {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		float score=scan.nextInt();  //double score=scan.nextdouble();
		scan.nextLine();
	    String dep=scan.nextLine();
	    System.out.println("My name is " +name);
	    System.out.println("My score is " +(score/10) +"/10");
	    System.out.println("My Department is " +dep);
		

	}

}
