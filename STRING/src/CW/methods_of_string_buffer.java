package CW;

import java.util.Scanner;

public class methods_of_string_buffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		StringBuffer s1=new StringBuffer(sc.next());
		System.out.println("capacity before tramToSize="+s1.capacity());
		 s1.trimToSize();
		System.out.println("capacity after tramToSize="+s1.capacity());
		System.out.println("enter string for concat");
		StringBuffer s2=new StringBuffer(sc.next());
		System.out.println("after append string="+s1.append(s2));
		
		System.out.println("after delete="+s2.delete(2, 4));
		
		System.out.println("after insert="+s2.insert(3,"india"));
		
		System.out.println("after replace="+s2.replace(2, 5, "_world"));
		
		System.out.println("after rever="+s2.reverse());

	}

}
