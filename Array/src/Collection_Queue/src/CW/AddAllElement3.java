package CW;

import java.util.PriorityQueue;

public class AddAllElement3 {

	public static void main(String[] args) {
		 PriorityQueue p1=new PriorityQueue();
	      p1.add("blue");
	      p1.add("green");
	      p1.add("black");
	      p1.add("white");
	      
	     System.out.println("first set:\n"+p1);
	 	 PriorityQueue p2=new PriorityQueue();
         p2.addAll(p1);
         System.out.println("after add set:\n"+p2);
	}

}
