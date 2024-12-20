package errormakesclever;
import java.util.Scanner;

public class Ternaryoperator {
	public static void main(String[] args) {
	//	boolean rain=false;
	//	String result=rain?"Take the Umbrella":"Enjoy the sunlight";
	//	System.out.println(result);
		
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		String result=a>b ? "A is greater":"B is greater";
		System.out.println(result);
	}

}
