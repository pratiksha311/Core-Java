package Practice;

import java.util.Scanner;

public class Max_Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		char[] c1=new char[c.length];
		int[] temp=new int[c.length];
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]='0';
					count++;
				}
			}
			if(c[i]!='0')
			{
				c1[i]=c[i];
			}			
		}
	}

}
