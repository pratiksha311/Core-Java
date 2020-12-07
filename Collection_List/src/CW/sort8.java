package CW;

import java.util.ArrayList;
import java.util.Collections;

public class sort8 {

	public static void main(String[] args) {
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		System.out.println("Before sorting :\n"+s1);
		Collections.sort(s1);
		System.out.println("After sorting :\n"+s1);

	}

}
