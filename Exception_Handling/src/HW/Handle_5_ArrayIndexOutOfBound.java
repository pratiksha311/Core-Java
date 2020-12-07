package HW;

import java.util.Scanner;

public class Handle_5_ArrayIndexOutOfBound {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		System.out.println("enter "+length+" elements");
		int[] c1=new  int[length];
		try
		{
			for(int i=0;i<=c1.length;i++)
			{
				System.out.print(c1[i]);
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
