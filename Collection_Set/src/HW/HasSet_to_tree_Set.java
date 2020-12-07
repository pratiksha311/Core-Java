package HW;

import java.util.HashSet;
import java.util.TreeSet;

public class HasSet_to_tree_Set {

	public static void main(String[] args) {
		HashSet t1=new HashSet();
		 t1.add(1);
		 t1.add(2);
		 t1.add(3);
		 t1.add(8);
		 t1.add(9);
		 TreeSet t2=new TreeSet(t1);
		 System.out.println("tree set:\n"+t2);

	}

}
