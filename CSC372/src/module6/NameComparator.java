package module6;

import java.util.*;

public class NameComparator implements Comparator {

	
// comparator class that compares name value and returns integer result
public int compare(Object o1, Object o2) {
	Student s1 = (Student)o1;
	Student s2 = (Student)o2;
	return s1.name.compareTo(s2.name);
}
}