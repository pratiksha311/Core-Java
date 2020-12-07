
package HW;

import java.util.Iterator;
import java.util.TreeSet;

public class IterateaAllElementInTreeSet {

	public static void main(String[] args) {
		
		 TreeSet t1=new TreeSet();
		 t1.add(1);
		 t1.add(2);
		 t1.add(3);
		 t1.add(8);
		 t1.add(9);
		 
		 Iterator i=t1.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }

	}

}
