package HW;

import java.util.Scanner;

public class Specific_value {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		int a[]=new int[length];
		
		System.out.println("enter "+length+ " element");
		for(int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter value to check prenet or not");
		int value=sc.nextInt();
		int count=0;
		for(int i=0;i<length;i++)
		{
			count++;
			if(a[i]==value)
			{
				System.out.println("this value is present in array");
			}
		}
		if(count==length)
		{
			System.out.println("this value is not present in array");
		}

	}

}
