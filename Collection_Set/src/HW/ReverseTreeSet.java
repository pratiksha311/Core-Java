package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ReverseTreeSet {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add("blue");
		t1.add("red");
		t1.add("yellow");
		t1.add("black");
		
		ArrayList a1=new ArrayList(t1);
		System.out.println("Before reverse:\n"+t1);
		Collections.reverse(a1);
		System.out.println("After reverse:\n"+a1);
	}

}
