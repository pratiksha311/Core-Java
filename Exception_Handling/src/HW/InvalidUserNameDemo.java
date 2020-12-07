package HW;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class InvalidUserNameDemo extends Try_catch{
		
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1:try.....catch...demo");
		System.out.println("2:try.....multi...catch");
		System.out.println("3:try........finally");
		System.out.println("4:try..catch.....finally");
		System.out.println("5:throw");
		System.out.println("6:throws");
		System.out.println("enter choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		System.out.println("enter the value of a,b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a, b);
		
		case 2:
			System.out.println("enter the value of a,b");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 add2(a, b);
			 
		case 3:
			System.out.println("enter the value of a,b");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 add3(a, b);
			 
		case 4:
			System.out.println("enter the value of a,b");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 add4(a, b);
			 
		case 5:
			System.out.println("enter name");
			String s1="pratiksha";
			String name=sc.next();
			if(name.equals(s1))
			{
				System.out.println("name is pratiksha");
			}
			else
			{
				try {
					
					throw new InvalidUserName("name is not present");
					
				}
				catch(InvalidUserName e)
				{
					System.out.println(e);
				}
			}
			
			
		case 6:m2();
		
		default : System.out.println("enter correct option");
		
		}
		
		
		
		
	}


		


	

}
