package CW;

import java.util.Scanner;

public class Unique_Pairs_In_Array {

	public static void main(String[] args) {
		
		int count=0;
		int a[]= {1,1,2};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=0;
					}
					if(a[j]!=0)
					{
					System.out.print("("+a[i]+","+a[j]+")");
				
					System.out.print("("+a[j]+","+a[i]+")");
					count=count+2;
					}
				}
				System.out.print("("+a[i]+","+a[i]+")");
			    count++;
			}
		}
		System.out.println();
		System.out.println("output="+count);
		System.out.println();
		
		
		
		
		
		count=0;
	   System.out.println("for second input");
	   System.out.println("enter length of array");
	   Scanner sc=new Scanner(System.in);
	   int length=sc.nextInt();
	   System.out.println("enter "+length+" elements");
	   for(int i=0;i<length;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   for(int i=0;i<length;i++)
	   {
		   for(int j=i+1;j<length;j++)
		   {
			   System.out.print("("+a[i]+","+a[j]+")");
			   System.out.print("("+a[j]+","+a[i]+")");
			  count=count+2;
		
	       }
		   System.out.print("("+a[i]+","+a[i]+")");
		   count++;
	}
		System.out.println();
		System.out.println("output="+count);
	}
}