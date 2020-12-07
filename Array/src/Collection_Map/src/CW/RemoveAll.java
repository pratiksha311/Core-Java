package CW;

import java.util.HashMap;

public class RemoveAll {

	public static void main(String[] args) {
       HashMap h1=new HashMap();
		
		h1.put(1, "hello");
		h1.put(20, "hi");
		h1.put(56, "bye");
		h1.put("hello","23");
		
		System.out.println("hash map : \n"+h1);
		
		h1.clear();
		System.out.println("remove all in map:\n"+h1);

	}

}
