package HW;

import java.util.Scanner;

public class Second_Largest_number {

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
		int large=0;
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[large]<a[j])
				{
					large=j;
				}
			}
			int temp=a[i];
			a[i]=a[large];
			a[large]=temp;
		}
		
			System.out.print("second largest no is"+a[1]);
	
	}

}
