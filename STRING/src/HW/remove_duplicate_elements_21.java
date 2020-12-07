package HW;

import java.util.Scanner;

public class remove_duplicate_elements_21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		char[] c2=new char[c.length];
		int m=0;
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<c.length;j++)
			{
					if(c[i]==c[j])
					{
						c[j]='0';
					
					}
			}
			if(c[i]!='0')
			{
			    c2[m]=c[i];
			    m++;
			}
		}
		System.out.println("after remove duplicate elements");
		for(int i=0;i<m;i++)
		{
			c[i]=c2[i];
		   System.out.print(c[i]);
			
		}
		

	}

}
