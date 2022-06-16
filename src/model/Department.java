package model;

public class Department {

	private String depName;
	
	private Student[] students;
	
	
	public Department() {
		
		
	}
 	
	
	public Department(String depName) {
		
		this.depName = depName;
		
	}
	
	public Department(String depName, Student[] students) {
		
		this(depName);
		this.students = students;
	}
	
	


	public void dinfo() {
		
		System.out.println("Department Name: " + this.depName);
	}
	public void dFullInfo() {
		this.dinfo();
		System.out.println(" Students Name: " + this.students);
		
	}
	

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
	
}
