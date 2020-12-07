package CW;

import java.util.PriorityQueue;

public class ConvertQueueToArray {

	public static void main(String[] args) {
		 PriorityQueue p1=new PriorityQueue();
	      p1.add("blue");
	      p1.add("green");
	      p1.add("black");
	      p1.add("white");
	      
	     Object[] s=p1.toArray();
	     System.out.println("In array");
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
 
	}

}
