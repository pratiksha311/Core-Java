package HW;

import java.util.Scanner;

public class minimum_row_max_col {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of elements");
		int length=sc.nextInt();
		int a[][]=new int[length][length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
		   int small=a[i][0];
		   for(int j=0;j<a.length;j++)
		   {
			   if(small>a[i][j])
			   {
				   small=a[i][j];
			   }
		   }
		   System.out.println("small element in rows="+small);

		}
		for(int i=0;i<a.length;i++)
		{
		   int large=a[i][0];
		   for(int j=0;j<a.length;j++)
		   {
			   if(large<a[i][j])
			   {
				   large=a[i][j];
			   }
		   }
		   System.out.println("large element in rows="+large);

		}
	}

}
