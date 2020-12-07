package Day5;

import java.util.Scanner;

public class Sum_of_prime_digit_is_prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		System.out.println("enter "+length+" elements");
		int[] a=new int[length];
		int[] b=new int[length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int flag=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				int sum=0;
				int temp=a[i];
				while(a[i]>0)
				{
					int r=a[i]%10;
				    sum=sum+r;
				    a[i]=a[i]/10;
				}
				for(int k=2;k<sum;k++)
				{
					if(sum%k==0)
					{
						flag++;
					}
				}
				if(flag==0)
				{
				
					b[m]=temp;
					m++;
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
