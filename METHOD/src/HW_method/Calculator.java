package HW_method;

import java.util.Scanner;


public class Calculator {
	
	int calaculateSum( int n1,int n2)
	{
		int sum=n1+n2;
		return sum;
	}
	int calaculateDiff( int n1,int n2)
	{
		int diff=n1-n2;
		return diff;
	}

	
	public static void main(String[] args) {
		Calculator p=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 no");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=p.calaculateSum(n1, n2);
		System.out.println("sum="+sum);
		int diff=p.calaculateDiff(n1, n2);
		System.out.println("difference="+diff);
}



}
