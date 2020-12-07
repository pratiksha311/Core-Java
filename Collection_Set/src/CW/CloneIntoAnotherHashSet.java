package CW;

import java.util.HashSet;

public class CloneIntoAnotherHashSet {

	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		System.out.println("before clone=\n"+s1);
		
		HashSet h2=(HashSet) s1.clone();
		System.out.println("After clone=\n"+h2);

	}

}
