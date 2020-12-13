package HW;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter length of element:");
		 int length=sc.nextInt();
		 int[] a=new int[length];
		 int[] b=new int[length];
		 System.out.println("enter "+length+" elements");
		 for(int i=0;i<length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		
		 for(int i=0;i<length;i++)
		 {
			 int count=0;
		     for(int j=i+1;j<length;j++)
		     {
		    	 if(a[i]==a[j])
		    	 {
		    		 count++;
				          a[j]=0;
		    	 }
		
		     }
		     if(a[i]!=0)
		     {
		    	 System.out.println(a[i]+":"+count);
		     }
		
		  }

	}

}
