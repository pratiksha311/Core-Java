package practice;

import java.util.Scanner;

public class AccountManagementDemo {
	
	int eid,amt;
	String ename;
	Scanner sc=new Scanner(System.in);
	void insertData()
	{
		eid=10;
		ename="xyz";
		amt=20000;
	}
	void display()
	{
		System.out.println("id="+eid+"name="+ename+"amt="+amt);
	}
	void depositeAmount()
	{
		System.out.println("enter amunt for deposit");
		int deposite=sc.nextInt();
		amt=amt+deposite;
		System.out.println("total amount after deposite="+amt);
		
	}
	void withdral()
	{
		System.out.println("enter amount to withdral");
		int with=sc.nextInt();
		if(with<=amt)
		{
			amt=amt-with;
		System.out.println("after withdral="+amt);
		}
		else
		{
			System.out.println("insufficient bal");
		}
	}
 
	public static void main(String[] args) {
		
		
		AccountManagementDemo a=new AccountManagementDemo();
		a.insertData();
		a.display();
		a.depositeAmount();
		a.withdral();
		

	}

}
