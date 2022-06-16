package model;

public class Student extends Person{

	private Instructor instructor;
	
	public Student(String name, String surname, int age, String gender) {
		
		super(name, surname, age, gender);
		
	}
	
	public void sInfo() {
		
		System.out.println("Student Name: " + super.getName() + "\n" + 
		                   "Student Surname: " + super.getSurname() + "\n" +
				           "Student Age: " + super.getAge() + "\n" +
		                   "Student Gender: " + super.getGender());
	}
	

	public void sFullInfo() {
		
		this.sInfo();
		
		System.out.println("Instructor Name: " + this.instructor);
		
	}
	
	
	
}
