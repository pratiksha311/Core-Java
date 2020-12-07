package CW;

import java.util.PriorityQueue;

public class RetriveFirstElement {

	public static void main(String[] args) {
		 PriorityQueue p1=new PriorityQueue();
	      p1.add("blue");
	      p1.add("green");
	      p1.add("black");
	      p1.add("white");
	      
	      System.out.println("before remove first element:\n"+p1);
	     
	      System.out.println("retrive first element:\n"+ p1.peek());
	      System.out.println("After remove first element:\n"+p1);

	}

}
