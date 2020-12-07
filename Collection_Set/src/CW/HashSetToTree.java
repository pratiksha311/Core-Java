package CW;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTree {

	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		
		System.out.println("before convert to treeSet=\n"+s1);
		
		TreeSet t1=new TreeSet(s1);
		System.out.println("After convert to treeSet=\n"+t1);
	}

}
