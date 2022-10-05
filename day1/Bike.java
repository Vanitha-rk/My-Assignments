package week1.day1;

public class Bike {
	public void applyBreak(String apply) 
	{
		System.out.println(apply);
	}
	public void soundHorn(String sound)
	{
		System.out.println(sound);
	}


	public static void main(String[] args) {
		
		Car c =new Car();
		System.out.println("Car details");
		c.applyBreak("Applied break");
		c.soundHorn("Sound horn");
		Bike g = new Bike();
		System.out.println("\nBike details");
		g.applyBreak("Applied break");
		g.soundHorn("Sound horn");
		
		
		
	}

	

}
