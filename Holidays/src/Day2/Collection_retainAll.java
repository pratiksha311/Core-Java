package Day2;

import java.util.ArrayList;

public class Collection_retainAll {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add(45);
		a1.add(122);
		a1.add(86);
		a1.add(78);
		
		System.out.println("Using reatin all methos :\n"+retainAll(a1));
	}
}
