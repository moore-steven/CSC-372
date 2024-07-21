package module6;

// Student class to hold student information

public class Student {
	int rollno;
	String name;
	String address;
	
	Student() {
		rollno = 0;
		name = "blank";
		address = "blank";	
	}
	
	Student(int rollin, String namein, String addressin) {
		this.rollno = rollin;
		this.name = namein;
		this.address = addressin;
	}
}
