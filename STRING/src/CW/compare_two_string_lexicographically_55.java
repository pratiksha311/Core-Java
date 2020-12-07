package CW;

import java.util.Scanner;

public class compare_two_string_lexicographically_55 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		System.out.println("enter second string");
		String s2=sc.next();
		char[] c2=s2.toCharArray();
		if(c1.length==c2.length)
		{
			int count=0;
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]==c2[i])
				{
					count++;
				}
			}
			if(count==c1.length)
			{
				System.out.println(1);
			}
			
			else
			{
				int sum1=0;
				int sum2=0;
				if(count!=c1.length)
				{
				
					for(int i=0;i<c1.length;i++)
					{
						sum1=sum1+c1[i];
					}
					System.out.println(sum1);
					for(int i=0;i<c2.length;i++)
					{
						sum2=sum2+c2[i];
					}
					System.out.println(sum2);
					
				}
				int a=sum1-sum2;
				System.out.println(a);
			
			}
		}	
		else
		{
			int b=(c1.length-1)-(c2.length-1);
			System.out.println(b);
		}

	}

}
