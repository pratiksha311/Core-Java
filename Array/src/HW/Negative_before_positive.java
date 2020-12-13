package HW;

import java.util.Scanner;

public class Negative_before_positive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		int a[]=new int[length];
		int i;
		System.out.println("enter "+length+ " element");
		for(i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i];
			}
			else
			{
				for(int j=i+1;j<length;j++)
				{
					if(a[j]<0)
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				
			}
		}
		for(i=0;i<length;i++)
		{
			System.out.print(a[i]+" ");
		}
	

	}

}
