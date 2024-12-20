package classesandobjects;

public class Garden {
	int apple_price=20;
	int apple_count=5;
	void total_money() {
		int multiply= apple_price*3;
		System.out.println(multiply);
	}
	
	public static void main(String[] args) {
		Garden gar= new Garden();
		gar.total_money();
	}
}
