package HW;

import java.util.Scanner;
import java.util.TreeSet;

public class StrictlyGreaterThanEqualto14 {

	public static void main(String[] args) {
		 TreeSet t1=new TreeSet();
		 t1.add(1);
		 t1.add(2);
		 t1.add(3);
		 t1.add(8);
		 t1.add(9);
		 
		 System.out.println("tree set :\n"+t1);
		 System.out.println("enter Element :");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 System.out.println(t1.ceiling(a));

	}

}
