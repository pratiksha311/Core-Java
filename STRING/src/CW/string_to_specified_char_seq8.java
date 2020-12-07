package CW;

import java.util.Scanner;

public class string_to_specified_char_seq8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of char array");
		int length=sc.nextInt();
		char[] c=new char[length];
		System.out.println("enter "+length+" charecter");
		for(int i=0;i<length;i++)
		{
			c[i]=sc.next().charAt(0);
		}
		
	    String s1=new String(c);
	    System.out.println(s1);
	    

	}

}
