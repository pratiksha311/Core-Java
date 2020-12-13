package HW;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter length of element:");
		 int length=sc.nextInt();
		 int[] a=new int[length];
		 int[] b=new int[length];
		 int[] c=new int[length];
		 System.out.println("enter "+length+" elements");
		 for(int i=0;i<length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 int j=0,m=0;
		 for(int i=0;i<length;i++)
		 {
			 if((a[i]%2)==0)
			 {
				
				 b[j]=a[i];
				 j++;
				 
			 }
			 else
			 {
				 c[m]=a[i];
				 m++;
			 }
		 }
		 System.out.println("even array");
		 for(int i=0;i<j;i++)
		 {
			 System.out.print(b[i]+" ");
		 }
		 System.out.println();
		 System.out.print("odd array");
		 System.out.println();
		 for(int i=0;i<m;i++)
		 {
			 System.out.print(c[i]+" ");
		 }
	}

}
