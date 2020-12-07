package HW;

import java.util.HashSet;

public class CompareTwoHashSet1 {

	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		
		HashSet s2=new HashSet();
		s2.add("blue");
		s2.add("red");
		s2.add("yellow");
		s2.add("black");
		
		boolean a=s1.equals(s2);
		System.out.println("compare ="+a);

	}

}
