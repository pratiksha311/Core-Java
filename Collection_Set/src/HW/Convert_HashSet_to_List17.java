package HW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Convert_HashSet_to_List17 {

	public static void main(String[] args) {
		HashSet t1=new HashSet();
		 t1.add(1);
		 t1.add(2);
		 t1.add(3);
		 t1.add(8);
		 t1.add(9);
		 
		 System.out.println("hash set:\n"+t1);
		 ArrayList a1=new 	 ArrayList(t1);
		 System.out.println("array set:\n"+a1);
	}

}
