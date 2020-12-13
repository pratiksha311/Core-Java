package HW;

import java.util.Scanner;

public class Matrix_Outer_Elements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of elements");
		int length=sc.nextInt();
		int a[][]=new int[length][length];
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
		System.out.println();
		
		//outer elements
		System.out.println("outer elements");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(i!=0 &&  i!=(length-1) && j!=0 && j!=(length-1) )
				{
					System.out.print(" "+" ");
					
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
