package CW;

import java.util.ArrayList;
import java.util.Scanner;

public class RetriveElement4 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();

		a1.add(15);
		a1.add("hello");
		a1.add("welcome");
		a1.add(20);
		System.out.println(a1);
		System.out.println("enter index to retrive specific element");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		System.out.println(a1.get(index));
	}
}
