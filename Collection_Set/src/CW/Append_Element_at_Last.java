package CW;

import java.util.ArrayList;
import java.util.HashSet;

public class Append_Element_at_Last {

	public static void main(String[] args) {
	
		HashSet s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		System.out.println("before add="+s1);
		ArrayList a1=new ArrayList();
		a1.addAll(s1);
		a1.add("12345");
		System.out.println("after add="+a1);

	}

}
