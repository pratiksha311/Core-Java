package HW_method;

import java.util.Scanner;

public class CalculatorDemo {
	
	public static void main(String args[]) {
		MenuDrivenCalculator c=new MenuDrivenCalculator();
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("1:addition");
		System.out.println("2:substraction");
		System.out.println("3:multiplication");
		System.out.println("4:division");
		System.out.println("enter choice");
		int ch=sc.nextInt();
		System.out.println("enter any two number :");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		switch(ch)
		{
		case 1:c.addition(n1, n2);
		break;
		
		case 2:c.substraction(n1, n2);
		break;
		
		case 3:c.multiplication(n1, n2);
		break;
		
		case 4:c.division(n1, n2);
		break;
		
		default:System.out.println("enter correct choice");
		}
		
	}

 

}
