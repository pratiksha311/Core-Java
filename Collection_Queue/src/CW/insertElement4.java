package CW;

import java.util.PriorityQueue;

public class insertElement4 {

	public static void main(String[] args) {
		 PriorityQueue p1=new PriorityQueue();
	      p1.add("blue");
	      p1.add("green");
	      p1.add("black");
	      p1.add("white");
	      
	      System.out.println("befor insert:\n"+p1);
	      p1.add("1234");
	      System.out.println("after insert:\n"+p1);

	}

}
