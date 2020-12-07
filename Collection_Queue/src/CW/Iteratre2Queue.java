package CW;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Iteratre2Queue {

	public static void main(String[] args) {
		 PriorityQueue p1=new PriorityQueue();
	      p1.add("blue");
	      p1.add("green");
	      p1.add("black");
	      p1.add("white");
	      
	      Iterator i=p1.iterator();
	      while(i.hasNext())
	      {
	    	  System.out.println(i.next());
	      }
	}

}
