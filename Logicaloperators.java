package errormakesclever;

public class Logicaloperators {
	public static void main(String[] args) {
		boolean hungry=false;
		boolean icecream=false;
		if(hungry || icecream) {        // && || operator
			System.out.println("Eat");
		}
		else {
			System.out.println("Don't Eat");
		}
	}

}
