package Extra;

import java.util.Scanner;

public class Display_duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		int[] a=new int[length];
		int[] b=new int[length];
	
		System.out.println("enter "+length+" elements");
		for(int i=0;i<a.length;i++ )
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			
			int count=1;

				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]!=0)
					{
						
						if(a[i]==a[j])
						{
						   System.out.print(a[j]+" "); 
						   count++;
						   a[j]=0;
						}
					}
				}
			if(count>1 && a[i]!=0)
			{
				
			System.out.print(a[i]+" ");
		//	System.out.println("hello");
			System.out.println("count ="+count);
			}
			
		}

	}

}
