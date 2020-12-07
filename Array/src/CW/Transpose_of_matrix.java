package CW;

import java.util.Scanner;

public class Transpose_of_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of elements");
		int length=sc.nextInt();
		int a[][]=new int[length][length];
		int b[][]=new int[length][length];
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
				
				b[i][j]=a[j][i];
			}
		
			System.out.println();
		}
		System.out.println();
		
		//Transpose Matrix
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
			
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
