package CW;

import java.util.ArrayList;

public class RemoveElement6 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(15);
		a1.add("hello");
		a1.add("welcome");
		a1.add(20);
		System.out.println("before remove element");
		System.out.println(a1);
		a1.remove(3);
		System.out.println("after remove element");
		System.out.println(a1);
	}

}
