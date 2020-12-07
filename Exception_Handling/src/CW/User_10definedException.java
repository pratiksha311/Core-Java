package CW;

import java.util.Scanner;

public class User_10definedException {
	
	static void m2()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name");
		String file=sc.next();
		String s1="abc";
		if(file.equals(s1))
		{
			System.out.println("file is present");
		}
		else
		{
			try
			{
			   throw new FileNotFound("file is not present");
			}
			catch(FileNotFound f)
			{
			   System.out.println(f);
			}
		}
		
	}

	public static void main(String[] args) {
	    
        m2();
	
	
	}

}
