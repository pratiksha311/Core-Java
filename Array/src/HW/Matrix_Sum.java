package HW;

import java.util.Scanner;

public class Matrix_Sum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of matrix");
		int length=sc.nextInt();
		int a[][]=new int[length][length];
		System.out.println("enter "+(a.length*a.length)+" elements");
		//first matrix
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//display first matrix
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//second matrix
		int b[][]=new int[length][length];
		System.out.println("enter "+(b.length*b.length)+" elements");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
	//display second matrix
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
        //Addition of matrix
		int c[][]=new int[length][length];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		//result
		System.out.println("addition");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
