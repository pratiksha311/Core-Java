package Practice;

import java.util.Scanner;

public class Sum_Of_Unique_digit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of first array");
		int length1=sc.nextInt();
		int[] a=new int[length1];
		
		int sum1=0;
		int sum2=0;
		System.out.println("enter "+length1+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter length of first array");
		int length2=sc.nextInt();
		int[] b=new int[length2];
		System.out.println("enter "+length2+" elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int sum=0;
		int m=0;
		int[] c=new int[a.length+b.length];
			for(int i=0;i<a.length;i++)
			{
				int count=0;
				for(int j=0;j<b.length;j++)
				{
				      if(a[i]==b[j])
				      {
				    	  count++;
					  }
				}
				if(count==0)
				{
					c[m]=a[i];
					System.out.println(c[m]+" ");
					sum=sum+c[m];
					m++;
				}
			}
	System.out.println("second array");
	for(int i=0;i<b.length;i++)
	{
		int count=0;
		for(int j=0;j<a.length;j++)
		{
		      if(b[i]==a[j])
		      {
		    	  count++;
			  }
		}
		if(count==0)
		{
			c[m]=b[i];
			System.out.println(c[m]+" ");
			sum=sum+c[m];
			m++;
		}
	}
	System.out.println("sum="+sum);
	}
}
