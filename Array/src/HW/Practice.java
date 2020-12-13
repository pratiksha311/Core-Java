package HW;

import java.util.Scanner;

public class Practice {
	
	public static void main(String args[])
	{
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
		
		for(int i=0;i<length;i++)
		{
			int small=a[i][0];
			int k=0;
			for(int j=0;j<length;j++)
			{
				if(small>a[i][j])
				{
					small=a[i][j];
					k=j;
				}
		 
			}
			int m;
			for(m=0;m<length;m++)
			{
				if(small<a[m][k])
				{
					break;
				}
			}
			if(m==length)
			{
				System.out.println(small+" is a sadle point");
			}
		}
			
		}
		
	
		
	}

