package HW;

import java.util.Scanner;

public class String_27_toggle_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]>=65 && c1[i]<97)
			{
				c1[i]= (char) (c1[i]+((char) (c1[i]+32)));
			}
			else
				
				
			{
				if(c1[i]>=97 && c1[i]<129)
				{
					c1[i]= (char) (c1[i]+((char) (c1[i]-32)));
				}
			}
		}
			for(int i=0;i<c1.length;i++)
			{
				System.out.print(c1[i]);
			}
			
		}

	}


