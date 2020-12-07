package HW;

import java.util.Scanner;

public class Content_of_as_charecter_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
		 System.out.print(c[i]+" ");
		}
		

	}


}
