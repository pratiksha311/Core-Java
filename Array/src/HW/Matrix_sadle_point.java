package HW;

import java.util.Scanner;

public class Matrix_sadle_point {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		System.out.println("enter "+(length*length)+" ----elements");
		int[][] a=new int[length][length];
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	//k is position
		for(int i=0;i<length;i++)
		{
			int k=0;
			int small=a[i][0];
			for(int j=0;j<length;j++)
			{
				if(small>a[i][j])
				{
					small=a[i][j];
					k=j;
				}
		      // System.out.println(small);
		      // System.out.println(j);
		   }	 
		       int m;
			   for( m=0;m<length;m++)
			   {
				   if(a[m][k]>small)
					{
						break;
					}
				  
			   }
			   if(m==length)
			   {
				   System.out.println(small+" is a saddle point");
			   }
	    }
	    }

}

