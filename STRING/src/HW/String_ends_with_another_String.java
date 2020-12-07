package HW;

import java.util.Scanner;

public class String_ends_with_another_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		System.out.println("enter second String");
		String s2=sc.next();
		char[] c2=s2.toCharArray();
		int count=0;
		for(int i=c2.length-1,l=c1.length-1; i>=c1.length-1;  i--,l--)
		{
		  if(l>=0)	
		  {
			   if(c2[i]==c1[l])
				{
					count++;
				}		
		  }
		 
		}
		System.out.println(count);
		
		if(count==c1.length)
		{
			System.out.println("string ends with the contents of another strong");
		}
		else
		{
			System.out.println("string not ends with the contents of another strong");
		}
	}

}
