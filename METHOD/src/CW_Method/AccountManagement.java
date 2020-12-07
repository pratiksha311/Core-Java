package CW_Method;

import java.util.Scanner;

public class AccountManagement {
	
	int id,balance,amt;
	long mob;
	String name,branch,address;
	
	void insertData()
	{
		 name="xyz";
		 id=1222;
	     mob=123456789l;
	     balance=5000;
		 branch="pune";
		 address="balaji nagar";
		 System.out.println();
	}
	
	void display()
	{
		System.out.println("name = "+name);
		System.out.println("id = "+id);
		System.out.println("mobile no = "+mob);
		System.out.println("balance ="+balance);
		System.out.println("branch ="+branch);
		System.out.println("address ="+address);	
	
	}
	void depositAmount(int amt1)
	{
		
		amt=amt1;
	    balance=balance+amt;
	    System.out.println("After deposite balance="+balance);
	}
	void withdrawAmount(int amt1)
	{
		Scanner sc=new Scanner(System.in);
		amt=amt1;
		if(balance>amt)
		{
		balance=balance-amt;
	    System.out.println("After widtdrwal balance="+balance);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	void checkBalance()
	{
		
		System.out.println("balance="+balance);
		                            
	}
	

}
