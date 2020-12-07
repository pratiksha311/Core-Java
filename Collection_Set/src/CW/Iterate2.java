package CW;

import java.util.HashSet;
import java.util.Iterator;

public class Iterate2 {

	public static void main(String[] args) {
	HashSet s1=new HashSet();
	s1.add("blue");
	s1.add("red");
	s1.add("yellow");
	s1.add("black");
	
	Iterator i=s1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

	}

}
