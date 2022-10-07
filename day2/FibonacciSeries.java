package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,sum;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<7 ;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
		
	}

}
