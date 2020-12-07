package HW;

import java.util.Scanner;

public class String_start_with_contentOf_anotherString_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		System.out.println("enter second String");
		String s2=new String(sc.next());
		char[] c2=s2.toCharArray();
		if(c1[0]==c2[0])
		{
			System.out.println("string  start with content of another string");
		}
		else
		{
			System.out.println("string  not start with content of another string");
		}
	}

}
