package week3day2;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("id:" +id);
	}
	
    public void getStudentInfo(int id,String name) {
		System.out.println("id:" +id);
		System.out.println("Name:" +name);
	}
    public void getStudentInfo(String email, String phoneno) {
	
    	System.out.println("Email:" +email);
		System.out.println("Phone No:" +phoneno);
     }
	

	public static void main(String[] args) {

		Students s=new Students();
		s.getStudentInfo(74);
		s.getStudentInfo(74, "Vanitha");
		s.getStudentInfo("Vanithark2704@gmail.com", "9876543210");
	}

}
