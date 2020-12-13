package HW;

import java.util.Scanner;

public class Matrix_Substraction{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of elements");
		int length=sc.nextInt();
		int a[][]=new int[length][length];
		int b[][]=new int[length][length];
		int c[][]=new int[length][length];
		//first matrix
		System.out.println("enter "+length*length+" elements");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
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
		//second  matrix
				System.out.println("enter "+length*length+" elements");
				for(int i=0;i<length;i++)
				{
					for(int j=0;j<length;j++)
					{
						b[i][j]=sc.nextInt();
					}
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
		//Substraction
				for(int i=0;i<length;i++)
				{
					for(int j=0;j<length;j++)
					{
						c[i][j]=a[i][j]-b[i][j];
					}
				}
		//display Substraction
				System.out.println("substraction ");
				for(int i=0;i<length;i++)
				{
					for(int j=0;j<length;j++)
					{
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
		
	
	}

}
