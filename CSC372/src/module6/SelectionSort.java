package module6;

import java.util.ArrayList;


public class SelectionSort  {
	
	public static void sort (ArrayList<Student> list, NameComparator nc) {
		int i;
		int j;
		int small;
		Student temp = new Student();
		
		
		for (i=0; i < list.size(); ++i) {
			
			small = i;
			
			for(j = i + 1; j < list.size(); ++j) {
				 if ((nc.compare(list.get(j), list.get(small))) < 0) {
					small = j;					
					
				}
			}
			temp = list.get(i);
			list.set(i, list.get(small));
			list.set(small, temp);
			
		}
	}
	
	public static void sort (ArrayList<Student> list, RollNoComparator rc) {
		int i;
		int j;
		int small;
		Student temp = new Student();
		
		
		for (i=0; i < list.size(); ++i) {
			
			small = i;
			
			for(j = i + 1; j < list.size(); ++j) {
				 
				 if ((rc.compare(list.get(j), list.get(small))) < 0) {
					small = j;					
					
				}
			}
			temp = list.get(i);
			list.set(i, list.get(small));
			list.set(small, temp);
			
		}
	}

}
