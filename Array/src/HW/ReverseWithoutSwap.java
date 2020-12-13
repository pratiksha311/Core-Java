package HW;

import java.util.Scanner;

public class ReverseWithoutSwap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of element:");
		int length=sc.nextInt();
		int[] a=new int[length];
		int[] b=new int[length];
		System.out.println("enter "+length+" elements");
		for(int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0,l=length-1;i<=length-1;i++,l--)	
		{
			b[i]=a[l];
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(b[i]+" ");
		}
	   
	}
		
	} 

