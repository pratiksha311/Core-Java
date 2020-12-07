package HW;

import java.util.Scanner;

public class Content_of_String_as_byte_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		byte[] b=s1.getBytes();
		for(int i=0;i<b.length;i++)
		{
		System.out.print(b[i]+" ");
		}

	}

}
