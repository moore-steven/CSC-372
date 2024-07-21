package module6;

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
		rollno = rollin;
		name = namein;
		address = addressin;
	}
}
