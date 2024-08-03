package module8;

// Student class to hold student information

public class Student {
	double GPA;
	String name;
	String address;
	
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
}
