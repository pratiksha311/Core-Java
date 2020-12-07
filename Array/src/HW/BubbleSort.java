package HW;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter length of element:");
	 int length=sc.nextInt();
	 int[] a=new int[length];
	 System.out.println("enter "+length+" elements");
	 for(int i=0;i<length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 for(int i=0;i<length;i++)
	 {
	     for(int j=i+1;j<length;j++)
	     {
	    	 if(a[i]>a[j])
	    	 {
	    	 int temp=a[i];
	    	 a[i]=a[j];
	    	 a[j]=temp;
	    	 }
	     }
	 
	 }
	 for(int i=0;i<length;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	}

}
