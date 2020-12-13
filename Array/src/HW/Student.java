package HW;

import java.util.Scanner;

public class Student {
	int rollno,marks;
	String name;
	Student(int rollno,int marks,String name)
	{
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
	}
	void display()
	{
		System.out.println("rollno="+ rollno + " marks=" + marks + " name=" + name );
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student[] s=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("enter rollno,marks,name");
			s[i]=new Student(sc.nextInt(), sc.nextInt(), sc.next());
			
		}
		int larger=s[0].marks;

		for(int i=1;i<s.length;i++)
		{
			if(larger<s[i].marks)
			{
				larger=s[i].marks;
			}
		}	
	   for(int i=0;i<s.length;i++)
	   {
		  if(s[i].marks==larger)
		  {
			s[i].display();
		  }
	  }
	  
	
	}
}

