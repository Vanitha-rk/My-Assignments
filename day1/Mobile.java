package week1.day1;

public class Mobile 
{
	
	public void makeCall(String mobilemodel,float mobileweight) 
	{
	System.out.println("Mobile model is " +mobilemodel);
	System.out.println("Mobile weight is " +mobileweight);
	
	}
	public void sengMsg(boolean charge,int mobilecost)
	{
		System.out.println("Is full charged " +charge );
		System.out.println("Mobile Cost is " +mobilecost);
	}
	public static void main(String[] args) {
		Mobile m= new Mobile();
		System.out.println("This is my mobile");
		m.makeCall("Samsung",140f);
		m.sengMsg(true,17000);
		
	}
	

}
