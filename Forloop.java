package errormakesclever;

import java.util.Scanner;
public class Forloop {
	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);
	//	int a=scan.nextInt();
	//	int b=scan.nextInt();
	//	for(int i=a;i<=b;i++) {
	//		System.out.println(i);
	//	}
		
		//Print even numbers between 1 to 10
		int evencount = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);  //for even number
				evencount=evencount+1;
			}
			else 
			{
			//	System.out.println(i);  //for odd number
			//	a++;
			}
			
		}
		System.out.println("Total even numbers:" +evencount);
	}

}
