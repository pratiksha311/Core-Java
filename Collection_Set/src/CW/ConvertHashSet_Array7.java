package CW;

import java.util.HashSet;

public class ConvertHashSet_Array7 {
	public static void main(String[] args) {
		

		HashSet <String>s1=new HashSet();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		System.out.println("In hashset=\n"+s1);
		System.out.println("hiii");
		Object[] a=s1.toArray();
		System.out.println("In array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
