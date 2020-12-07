package CW;

import java.util.HashSet;

public class TestHashSetEmpty5 {

	public static void main(String[] args) {
	
		HashSet s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		System.out.println("before empty=\n"+s1);
		System.out.println("check empty="+s1.isEmpty());
		

	}

}
