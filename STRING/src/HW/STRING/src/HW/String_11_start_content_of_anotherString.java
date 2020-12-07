package HW;

import java.util.Scanner;

public class String_11_start_content_of_anotherString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		System.out.println("enter second String");
		String s2=new String(sc.next());
		char[] c2=s2.toCharArray();
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			if(c2[i]==c1[i])
			{
				count++;
			}
		}
		if(count==c1.length)
		{
			System.out.println("string start with content of another string");
		}
		else
		{
			System.out.println("string not start with content of another string");
		}

	}

}
