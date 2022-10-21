package org.student;

import org.department.Department;

public class Student extends Department
{

	public void studentName() {
		System.out.println("Vanitha");
	}
	
	public void studentDept() {
		System.out.println("ECE");
	}
	
	public void studentId() {
		System.out.println("74");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("College Details");
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		System.out.println("\nDepartment Details");
		s.deptName();
		System.out.println("\nStudent Details");
		s.studentName();
		s.studentDept();
		s.studentId();
	}
}
