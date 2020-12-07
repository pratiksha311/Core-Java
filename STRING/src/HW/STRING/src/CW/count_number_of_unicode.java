package CW;

import java.util.Scanner;

public class count_number_of_unicode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
	    System.out.println("no of unicode points in specified text in range ="+s1.codePointCount(3, 7));
	}

}
