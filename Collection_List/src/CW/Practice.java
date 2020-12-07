package CW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
	
		PriorityQueue t1=new PriorityQueue();
		 t1.add(1);
		 t1.add(2);
		 t1.add(3);
		 t1.add(8);
		 t1.add(9);
		 
	     PriorityQueue t2=new PriorityQueue();
	     t2.addAll(t1);
	    
	     System.out.println(t1);
	     System.out.println(t1.peek());
	     System.out.println(t2);
		 Iterator i=t1.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
	}

}
