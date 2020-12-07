package CW;

import java.util.ArrayList;

public class CopyArray10 {

	public static void main(String[] args) {
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("blue");
		s1.add("red");
		s1.add("yellow");
		s1.add("black");
		
		ArrayList<String> s2=new ArrayList<String>();
		s2.addAll(s1);
        System.out.println("Copy arraylist:\n"+s2);
	}

}
