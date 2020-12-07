package HW;

import java.util.Scanner;

public class repeat_28_charecter_twice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		char[] c2=new char[c1.length+c1.length];
		for(int i=0;i<c1.length;i++)
		{
			int j=i+i;
			c2[j]=c1[i];
			c2[j+1]=c1[i];
		}
		for(int i=0;i<c2.length;i++)
		{
			System.out.print(c2[i]);
		}

	}

}
