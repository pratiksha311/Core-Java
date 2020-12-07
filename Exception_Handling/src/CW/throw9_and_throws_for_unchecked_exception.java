package CW;

import java.util.Scanner;

public class throw9_and_throws_for_unchecked_exception extends Exception{
	
	throw9_and_throws_for_unchecked_exception(String s)
	{
		super(s);
	}
	static void m1() throws ArithmeticException
	{
		int a=10;
		System.out.println("a="+a);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of b=");
		int b=sc.nextInt();
		if(b==0)
		{
		try
		{
			throw new throw9_and_throws_for_unchecked_exception("arithmatic exception divide by zero");
		   
		}
		catch(throw9_and_throws_for_unchecked_exception t)
		{
			System.out.println(t);
		}
		}
		else
		{
			int c=a/b;
			System.out.println("c="+c);
		}
	}

	public static void main(String[] args) {
	  
		m1();
   
	}

}
