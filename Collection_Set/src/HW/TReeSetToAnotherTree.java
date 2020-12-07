package HW;

import java.util.TreeSet;

public class TReeSetToAnotherTree {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add("blue");
		t1.add("red");
		t1.add("yellow");
		t1.add("black");
		
		TreeSet t2=new TreeSet();
		System.out.println("before Add all:\n"+t1);
		t2.addAll(t1);
		System.out.println("after Add all:\n"+t2);

	}

}
