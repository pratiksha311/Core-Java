package CW_Class;

import java.util.Scanner;

public class InstanceLocalStatic {
	int a=10;
   static int b=20;
	
	void input()
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter value of a,b");
//		 this.a=sc.nextInt();
//		this.int b=sc.nextInt();
	    int c=10;
		c=a+b+c;
		System.out.println("c="+c);
		
	}
	void decreament()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of c");
		int c=sc.nextInt();
		System.out.println("c ="+c);
		c--;
	}
	void display()
	{
		System.out.println("a= "+a+"\nb= "+b);
	}
	
	public static void main(String args[]) {
		
		InstanceLocalStatic d1=new InstanceLocalStatic ();
		InstanceLocalStatic d2=new InstanceLocalStatic ();
		d1.input();
		d1.decreament();
		d1.display();
		d2.input();
		d2.decreament();
		d2.display();
	}


}
