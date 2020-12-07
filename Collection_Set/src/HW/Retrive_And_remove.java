package HW;

import java.util.TreeSet;

public class Retrive_And_remove {

	public static void main(String[] args) {
		 TreeSet t1=new TreeSet();
		 t1.add(1);
		 t1.add(2);
		 t1.add(3);
		 t1.add(8);
		 t1.add(9);
		 
		 System.out.println("before remove first element :\n"+t1);
		 System.out.println("remove and retrive first element\n"+ t1.pollFirst());
		 System.out.println("after remove first element :\n"+t1);
		

	}

}
