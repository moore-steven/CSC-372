package module8;

// Student class to hold student information

public class Student {
	
	//updated class with private values to meet project requirements
	
	private double GPA;
	private String name;
	private String address;
	
	Student() {
		name = "blank";
		address = "blank";
		GPA = 0;
	}
	
	Student(String namein, String addressin, double GPAin) {
		this.GPA = GPAin;
		this.name = namein;
		this.address = addressin;
	}
	
	public String Export() {
		String info = "Name: " + this.name + " - Address: " + this.address + " - GPA: " + this.GPA;
		return info;
		
	}
	
	public String Getname() {
		return this.name;
	}
}
