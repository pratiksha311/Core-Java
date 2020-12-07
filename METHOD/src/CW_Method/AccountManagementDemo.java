package CW_Method;

import java.util.Scanner;

public class AccountManagementDemo {

	public static void main(String[] args) {
		AccountManagement a1=new AccountManagement();
		a1.insertData();
		a1.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:deposit");
		System.out.println("2:withdrawl");
		System.out.println("3:checkbalance");
		System.out.println("enter choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:a1.depositAmount(500);
		break;
		
		case 2:a1.withdrawAmount(40);
		break;
		
		case 3:a1.checkBalance();
		break;
		
		default:System.out.println("enter correct choice");
		}

	}

}
