package codingchallenges;
import java.util.Scanner;

public class Codingchallengesloan {
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your Salary:");
	  	int salary=scan.nextInt();
	  	System.out.println("Enter your Age:");
		int age=scan.nextInt();
		if(salary>=20000 || age<=25) 
		{
			System.out.println("Enter your Loan Amount:");
			int loanam=scan.nextInt();
			if(loanam<=50000) 
			{
				System.out.println("You are eligible for loan");
			}
			else 
			{
				System.out.println("Maximum loan amount is 50000");
			}
		}
		else {
			System.out.println("You are not eligible for loan");
		}
	}

}
