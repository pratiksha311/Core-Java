package HW;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class numberOfElementinTree {

	public static void main(String[] args) {
		 TreeSet t1=new TreeSet();
		 t1.add(1);
		 t1.add(2);
		 t1.add(3);
		 t1.add(8);
		 t1.add(9);
		 
		LinkedList t2=new LinkedList (t1);
		System.out.println("All elements are :"+t1);
		 System.out.println("enter number for getting elements");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 for(int i=0;i<a;i++)
		 {
			 System.out.println(t2.get(i));
		 }

	}

}
