package CW;

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("hi");
		a1.add("hello");
		a1.add(30);
		a1.add(1, "welcome");
		System.out.println(a1);
	}

}
