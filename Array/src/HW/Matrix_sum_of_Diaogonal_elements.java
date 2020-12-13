package HW;

import java.util.Scanner;

public class Matrix_sum_of_Diaogonal_elements {

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
		
		//sum of diagonals
		int sum=0,count=0;
		double avg=0;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if((i-j)==0)
				{
					System.out.print(a[i][j]);
					sum=sum+a[i][j];
					count++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("sum="+sum);
		avg=sum/count;
		System.out.println("average="+avg);

	}

}
