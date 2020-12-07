package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sum_of_primary_secondary_diagonal {

	static int result(int sum,int sum1)
	{
		int a=1;
		int b=0;
		if(sum==sum1)
		{
			return a;
	
		}
		else
			return b;	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter length of matrix");
		int length=Integer.parseInt(br.readLine());
		int[][] c1=new int[length][length];
		System.out.println("enter "+length*length+" elements");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				int a=Integer.parseInt(br.readLine());
				c1[i][j]=a;
			}
		}
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.print(c1[i][j]+" ");
				
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if((i-j)==0)
				{
					System.out.print(c1[i][j]);
					sum=sum+c1[i][j];
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("sum1="+sum);
		int sum1=0;
		System.out.println("hello");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if((i+j)==length-1)
				{
					System.out.print(c1[i][j]);
					sum1=sum1+c1[i][j];
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("sum2="+sum1);
		
		System.out.println(result(sum,sum1));
		
			
	}

}
