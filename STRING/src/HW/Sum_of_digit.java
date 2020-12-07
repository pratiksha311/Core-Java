package HW;

import java.util.Scanner;

public class Sum_of_digit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
	
	    int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			int ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				//System.out.println("ch="+ch);
				int b=Integer.parseInt(s1.valueOf(ch));
				System.out.println("value of="+ch+" ="+b);
				sum=sum+b;
				System.out.println(sum);
				
		    }
			else
			{
				sum=sum+0;
			}
		}
		
		System.out.println("sum of digits is:"+sum);
	}


}
