package HW;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Try_catch {
	
	static void add(int a,int b)
	{
		System.out.println("output of try catch block");
		if(b==0)
		{
			try
			{
				int c=a/b;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
	static void add2(int a,int b)
	{
	int c;
	System.out.println("output of try and finally block");
	if(b==0)
	{
	
		try
		{
			c=a/b;
		}
		finally
		{
			System.out.println("hello");
		}
	}
    }
	static void add3(int a,int b)
	{
	int c;
	System.out.println("output of try , catch and finally block");
	if(b==0)
	{
	
		try
		{
			c=a/b;
		}
		catch(ArithmeticException  e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello");
		}
	}
    }
	static void add4(int a,int b)
	{
	int c;
	System.out.println("output of multiple catch block");
	if(b==0)
	{
		
		try
		{
			c=a/b;
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException  e)
		{
			System.out.println(e);
		}
		catch(Exception  e)
		{
			System.out.println(e);
		}
		
		
	}
	}
	static void m1() throws FileNotFoundException
	{
		FileReader fr=new FileReader("a.text");
		System.out.println("m1 ends");
	}
	
	static void m2() throws FileNotFoundException
	{
		m1();
		FileReader fr=new FileReader("a.text");
		System.out.println("m2 ends");
	}




}
