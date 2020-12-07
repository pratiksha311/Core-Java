package CW;

import java.util.Scanner;

public class Selection_Sort {

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
		//selection sort logic
		
		for(int i=0;i<length;i++)
		{
			int min=i,temp=0;
			for(int j=i+1;j<length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
