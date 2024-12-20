package classesandobjects;

public class Mobile {
	void iphone()
	{
		System.out.println("This is iphone");
	}
	void samsung() {
		System.out.println("This is samsung");
	}
	void vivo() {
		System.out.println("This is vivo");
	}

	public static void main(String[] args) 
	{
		System.out.println("Mobiles");
		Mobile mob=new Mobile();
		mob.iphone();
		mob.samsung();
		mob.vivo();
	}
}
