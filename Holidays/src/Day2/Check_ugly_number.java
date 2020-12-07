package Day2;

import java.util.Scanner;

public class Check_ugly_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ugly number");
		for( int n=1;n<=10;n++)
		{
			if(n%2==0 || n%3==0 || n%5==0)
			{
				System.out.println(n);
			}
		}
		System.out.println("enter any number");
		int number=sc.nextInt();
		if(number%2==0 || number%3==0 || number%5==0)
		{
			System.out.println("ugly number");
		}
		else
		{
		    System.out.println("not ugly number");
		}
				
				
				
	}

}
