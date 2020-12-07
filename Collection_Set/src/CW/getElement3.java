package CW;

import java.util.ArrayList;
import java.util.HashSet;

public class getElement3 {

	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		
		ArrayList a1=new ArrayList();
		a1.addAll(s1);
		for(int i=0;i<s1.size();i++)
		{
			System.out.println(a1.get(i));
		}

	}

}
