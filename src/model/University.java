package model;

public class University {

    public final static int MAX_DEPARTMENT_COUNT = 4;
    
	private String uniName;
	
	private Department[] departments = new Department[University.MAX_DEPARTMENT_COUNT];
	
	private  int sayac = 0;
	
	public University() {
		
		
	}
	
	public University(String uniName) {
		this.uniName = uniName;
		
	}
	
	public University(String uniName, Department[] departments) {
		
		this(uniName);
		
		if(departments.length < 4) {
			this.departments = departments;	
		}else {
			
			System.out.println("Belirlenen Max. Sayý Aþýmý");
		}
		
		
	}
	
	public void uinfo() {
		
		System.out.println("University Name: " + this.uniName );
	}
	
	public void uFullName() {
		
		this.uinfo();
		System.out.println(" Department Name: " + this.departments);
		
	}
	
	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public void addDepartment(Department department) {
		if(departments.length < 4) {
			this.departments = departments;
			
		this.departments[0] = department;
		}else {
			
			System.out.println("Kontejyan Aþýmý ");
		}
		this.setSayac(this.getSayac() + 1);
		
	}
	
	@Override
	public String toString() {
		
		return this.uniName + this.departments;
	}

	public int getSayac() {
		return sayac;
	}

	public void setSayac(int sayac) {
		this.sayac = sayac;
	}
	
}
