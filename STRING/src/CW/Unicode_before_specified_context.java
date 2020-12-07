package CW;

import java.util.Scanner;

public class Unicode_before_specified_context {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String in uppercase");
		String s1=new String(sc.next());
		//char[] c=s1.toCharArray();
		System.out.println(s1.codePointBefore(3));
	}

}
