package HW;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class LessThan7 {

	public static void main(String[] args) {
	 TreeSet t1=new TreeSet();
	 t1.add(1);
	 t1.add(2);
	 t1.add(3);
	 t1.add(8);
	 t1.add(9);
	 
	 System.out.println(t1);
     SortedSet s=t1.headSet(7);
	 System.out.println(s);
	 
	}

}
