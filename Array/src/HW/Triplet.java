package HW;

import java.util.Scanner;

public class Triplet {

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
        System.out.println("enter sum element:");
        int n=sc.nextInt();
        for(int i=0;i<length;i++)
        {
        	  for(int j=i+1;j<length;j++)
        	  {
        		  for(int k=j+1;k<length;k++)
        		  {
        			  if( (a[i]+a[j]+a[k])==n)
        			  {
        				
        				  System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
        				
        			  }
        		  }
        	  }
        }

	}

}
