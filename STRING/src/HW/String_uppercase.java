package HW;

import java.util.Scanner;

public class String_uppercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String in uppercase");
		String s1=new String(sc.next());
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			c[i]=(char) (c[i]+32);
			System.out.print(c[i]+" ");
		}

	}

}
