package model;

public class Instructor extends Person {
	
	private Student student;

	public Instructor(String name, String surname, int age, String gender) {
		super(name, surname, age, gender);
		
	}

    public void insInfo() {
		
     System.out.println("Instructor Name: " + super.getName() + "\n" + 
		                   "Instructor Surname: " + super.getSurname() + "\n" +
				           "Instructor Age: " + super.getAge() + "\n" +
		                   "Instructor Gender: " + super.getGender());
	}

    public void insFullInfo() {
    	
    	this.insInfo();
    	System.out.println("Instructor's Student Name: " + this.student);
    }



}
