package CW;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate2 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(10);
		a1.add(100);
		a1.add(101);
		a1.add(1);
		a1.add(11);
		
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			int x=(int) i.next();
			if(x==1)
			{
				System.out.println(x+1);
			}
		}
	}

}
