package Day1;

import java.util.Scanner;

public class Example_3_largest_integer_less_than_base2 {
	
	public static int logBase(int n)
	{
		int result=(int) (Math.log(n)/Math.log(2));
		return result;
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number : ");
		int n=sc.nextInt();
		System.out.println("Result : "+logBase(n));	
   }
}
