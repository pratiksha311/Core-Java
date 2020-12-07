package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_to_maximum_Priority_queue {

	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.offer("78");
		p1.offer("8");
		p1.offer("1");
		p1.offer("100");
		
		ArrayList a1=new ArrayList(p1);
		System.out.println("before convert priority queue to maximum Queue :\n"+a1);
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("before convert priority queue to maximum Queue :\n"+a1);

	}

}
