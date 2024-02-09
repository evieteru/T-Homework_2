package HW2;

public class Student {
	
	int id;
	double grade;
	String name;
	
	
	//Constructor
	public Student(int id, double grade, String name) {
		super();
		this.id = id;
		this.grade = grade;
		this.name = name;
	}
	
	
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public String toString() {
		return "Student [id=" + id + ", grade=" + grade + ", name=" + name + "]";
	}







	
	
	
	

}
