package HW;

import java.util.Scanner;

public class lenght_of_string_9 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		System.out.println("length of "+s1+" is "+c.length);
	}

}
