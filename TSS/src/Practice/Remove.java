package Practice;

import java.util.Scanner;

public class Remove {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		char[] c1=new char[c.length];
		int m=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]='0';
				}
			}
			if(c[i]!='0')
			{
				c1[m]=c[i];
				m++;
			}
		}
		int sum=0;
		for(int i=0;i<m;i++)
		{
			c[i]=c1[i];
			System.out.print(c[i]);
		}
	
	}

}
