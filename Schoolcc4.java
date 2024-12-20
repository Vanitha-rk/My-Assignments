package codingchallenges;
import java.util.Scanner;
public class Schoolcc4 {

	String passorfail(int num){
		if(num>=35) {
			return ("Pass");
		}
		else {
			return ("Fail");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		Schoolcc4 school=new Schoolcc4();
		String result=school.passorfail(marks);
		System.out.println(result);
		
	}
}
