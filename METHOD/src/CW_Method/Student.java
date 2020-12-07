package CW_Method;

import java.util.Scanner;

public class Student {
	int rollno,con,total;
	String name;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno,,name,contact no,total marks");
		rollno=sc.nextInt();
		name=sc.next();
		con=sc.nextInt();
		total=sc.nextInt();		
	}
	
	void display()
	{
		System.out.println("roll no ="+rollno);
		System.out.println("name = "+name);
		System.out.println("contact no"+con);
		System.out.println("total marks"+total);
	}

}
