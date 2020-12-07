package CW;

import java.util.Scanner;

public class Employee {
	
	int emp_id;
	String emp_name;
	double salary;
	Department d1;
	MyDate m1;
	
	Employee(int emp_id,String emp_name,double salary,Department d1,MyDate m1)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
		this.d1=d1;
		this.m1=m1;
	}
	
	public String toString() {
		return ("emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", d1=" + d1 + ", m1="
				+ m1);
	}
	public static void main(String[] args) {
		Employee[] e=new Employee[3];
		for(int i=0;i<e.length;i++)
		{
			System.out.println("enter empid,empname,salary,did,dname,date,month,year");
			Scanner sc=new Scanner(System.in);
			e[i]=new Employee(sc.nextInt(),sc.next(), sc.nextDouble(),new Department(sc.nextInt(), sc.next()),new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt()) );
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		

	}

}
