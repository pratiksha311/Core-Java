package HW_Class;

import java.util.Scanner;

public class NetSalary {
	
	int salary;
	int yr;
	
	void inputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary :");
		salary=sc.nextInt();
		System.out.println("enter year of services :");
		yr=sc.nextInt();
	}
	void dispayData()
	{
		if(yr>=3)
		{
			System.out.println(salary);
			double netsalary=salary+salary*0.2;
			System.out.println("net salary is = "+netsalary);
		}
		else
		{
			System.out.println("not eligible");
		}
	}
	
	public static void main(String args[]) {
		
		NetSalary n=new NetSalary();
		n.inputData();
		n.dispayData();
		
	}

}
