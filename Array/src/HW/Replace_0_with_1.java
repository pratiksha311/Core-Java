package HW;

import java.util.Scanner;

public class Replace_0_with_1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter length of array:");
        int length=sc.nextInt();
        int a[]=new int[length];
        System.out.println("enter any "+length+" of a's elements");
        for(int i=0;i<length;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<length;i++)
        {
        	if(a[i]==0)
        	{
        		a[i]=1;
        	}
        }
        for(int i=0;i<length;i++)
        {
        	System.out.print(a[i]+" ");
        }

	}

}
