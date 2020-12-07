package HW;

import java.util.Scanner;

public class Object_content_same_data {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		System.out.println("enter second String");
		String s2=new String(sc.next());
		char[] c2=s2.toCharArray();
		int count=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(c1[i]==c2[i])
				{
					count++;
				}
			}
			if(count==s1.length())
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
