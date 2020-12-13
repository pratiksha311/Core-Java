package HW;

import java.util.Scanner;

public class Remove_Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter length of array:");
        int length=sc.nextInt();
        int a[]=new int[length];
        System.out.println("enter any "+length+" elements");
        for(int i=0;i<length;i++)
        {
        	a[i]=sc.nextInt();
        }
        System.out.println("which element you want to remove");
        int remove=sc.nextInt();
        int count=0;
        for(int i=0;i<length;i++)
        {
        	if(a[i]==remove)
        	{
        		for(int j=i;j<length-1;j++)
        		{
        			a[j]=a[j+1];
        		}
        		count++;
        		break;
        	}
        }
        if(count==0)
        {
        	System.out.println("element not present");
        }
        else
        {
        for(int i=0;i<length-1;i++)
        {
        	System.out.print(a[i]+" ");
        }
        }
	}

}
