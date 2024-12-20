package codingchallenges;
import java.util.Scanner;
public class Findcc4 {
	void eveorodd(int num) {
		if(num%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		Findcc4 obj=new Findcc4();
		obj.eveorodd(num);
	}
}
