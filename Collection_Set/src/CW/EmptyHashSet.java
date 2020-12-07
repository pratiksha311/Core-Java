package CW;

import java.util.HashSet;

public class EmptyHashSet {

	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		System.out.println("before add="+s1);
		s1.clear();
		System.out.println("After empty="+s1);

	}

}
