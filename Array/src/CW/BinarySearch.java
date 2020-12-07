package CW;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		int a[]=new int[length];
		int i;
		System.out.println("enter "+length+ " element");
		for(i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		int l=0,r=length-1,mid,cmp=0;
		System.out.println("enter key element");
		int key=sc.nextInt();
		while(l<=r)
		{
			cmp++;
			mid=(l+r)/2;
			if(key==a[mid])
			{
				System.out.println(key+" is present at "+mid+" position");
				break;
			}
			else if(key>a[mid])
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
				
			
		}
		if(l>r)
		{
			System.out.println("key not found and comparision is="+cmp );
		}
	}
}
