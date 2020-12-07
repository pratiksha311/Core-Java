package HW;

import java.util.Scanner;

public class String_16_contains_only_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]>='0' && c1[i]<='9')
			{
				count++;
			}
		}
		if(count==c1.length)
		{
			System.out.println("string contains only digits");
		}
		else
			System.out.println("string does not contains only digits");
	}

}
