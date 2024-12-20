package codingchallenges;

import java.util.Scanner;

public class Threeinteger {
	
	public static void main(String[] args)
	{
	
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int d=a*b*c;
	System.out.println("Multiplied number:" +d);
	int e=a+b+c;
	System.out.println("Added number=" +e);
	System.out.println("Divided output=" +(d/e));
	}

}
