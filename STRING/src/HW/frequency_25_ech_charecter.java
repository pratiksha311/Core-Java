package HW;

import java.util.Scanner;

public class frequency_25_ech_charecter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		char[] c2=new char[c1.length];
		for(int i=0;i<c1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]==c1[j])
				{
					count++;
					c1[j]='0';					
				}
			}
			if(c1[i]!='0')
			{
				c2[i]=c1[i];
				System.out.println(c2[i]+":"+count);
			}
		}
	}

}
