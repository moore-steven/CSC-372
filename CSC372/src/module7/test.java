package module7;

import java.util.ArrayList;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        list.add("blue");
        list.add("pink");
        list.add("grey");
        list.add("purple");
        list.add("pink");
 

        TreeSet<String> set = new TreeSet<>();
        set.add("blue");
        set.add("pink");
        set.add("grey");
        set.add("purple");
        set.add("pink");
 
       
        System.out.println("List:  " + list);
     
        System.out.println("Set: " + set);

	}

}
