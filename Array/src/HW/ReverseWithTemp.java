package HW;

import java.util.Scanner;

public class ReverseWithTemp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length of array");
	int length=sc.nextInt();
	int a[]=new int[length];
	System.out.println("enter "+length+"elements");
	for(int i=0;i<length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0,l=length-1;i<=length/2;i++,l--)
	{
		int temp=a[i];
		a[i]=a[l];
		a[l]=temp;
	}
	
	for(int i=0;i<length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}

}
