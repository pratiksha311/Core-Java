package HW;

import java.util.Scanner;

public class Difference_Between_Largest_into_Smallest {

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
		int larger=a[0];
		int small=a[0];
		for(int i=1;i<length;i++)
		{
			if(larger<a[i])
			{
				larger=a[i];
			}
			if(small>a[i])
			{
				small=a[i];
			}
		}
		
	   System.out.println("largest element in array="+larger);
	   System.out.println("smallest element in array="+small);
	   System.out.println("difference between the largest and smallest value in array"+(larger-small));
	}

}
