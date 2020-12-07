package CW;

import java.util.PriorityQueue;

public class Compare3PriorityQueue {

	public static void main(String[] args) {
		 PriorityQueue p1=new PriorityQueue();
	      p1.add("blue");
	      p1.add("green");
	      p1.add("black");
	      p1.add("white");
	      
	      System.out.println("first queue:\n"+p1);
	      PriorityQueue p2=new PriorityQueue();
	      p2.add("blue");
	      p2.add("green");
	      p2.add("black");
	      p2.add("white");
	      System.out.println("second queue:\n"+p2);
	      
	      boolean b=p1.equals(p2);
	      System.out.println("  compare:"+b);
	    
	      
	      

	}

}
