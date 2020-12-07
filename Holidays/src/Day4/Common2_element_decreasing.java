package Day4;

import java.util.Scanner;

public class Common2_element_decreasing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		System.out.println("enter "+length+" element");
		int[] a=new int[length];
		int[] temp=new int[length];
		for(int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=0;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				temp[i]=count;
			
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]!=0)
			{
				for(int j=i+1;j<temp.length;j++)
				{
					if(temp[i]<temp[j])
					{
						int t=temp[i];
						temp[i]=temp[j];
						temp[j]=t;
					}
				}
			    for(int k=0;k<temp[i];k++)
			    {
				System.out.println(a[i]);
			    }
			
			}
			
		}
		

	}

}
