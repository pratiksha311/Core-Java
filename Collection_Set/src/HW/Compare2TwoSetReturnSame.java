package HW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Compare2TwoSetReturnSame {

	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		LinkedList l1=new LinkedList(s1);
		System.out.println("first set :"+s1);
		
		HashSet s2=new HashSet();
		s2.add("blue");
		s2.add("green");
		s2.add("yellow");
		s2.add("black");
		LinkedList l2=new LinkedList(s2);
		System.out.println("first set :"+s2);
		
		for(int i=0;i<l1.size();i++)
		{
			for(int j=0;j<l1.size();j++)
			{
				if(l1.get(i)==l2.get(j))
				{
					
					System.out.println(l1.get(i)+" is same in set");
				}
			}
		}
	}

}
