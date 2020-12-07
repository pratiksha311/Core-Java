package CW;

import java.util.Scanner;

public class Concat_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		System.out.println("enter second string");
		String s2=sc.next();
		char[] c2=s2.toCharArray();
		char[] c3=new char[s1.length()+s2.length()];
		for(int i=0;i<c1.length;i++)
		{
			c3[i]=c1[i];
			System.out.print(c3[i]+" ");
			
		}
		for(int i=c1.length;i<c3.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
		       	c3[i]=c2[j];
			}
			System.out.print(c3[i]+" ");
		}
		
		

	}

}
