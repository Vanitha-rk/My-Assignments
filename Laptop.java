package classesandobjects;

public class Laptop {
	// Classes and objects
	String name="";
	String proc="";
	int ram=0;
	int price=0;
	
	public static void main(String [] args) {
		 
		Laptop lap1=new Laptop();
		lap1.name="Hpp";
		lap1.proc="i5";
		lap1.ram=5;
		lap1.price=50000;
		System.out.println(lap1.name);
		
		Laptop lap2=new Laptop();
		lap2.name="Leenovo";
		lap2.proc="i8";
		lap2.ram=6;
		lap2.price=80000;
		System.out.println(lap2.price);
		
		Laptop lap3=new Laptop();
		System.out.println(lap3.price);
	}

}
