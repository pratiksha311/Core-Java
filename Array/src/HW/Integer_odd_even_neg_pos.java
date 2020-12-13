package HW;

import java.util.Scanner;

public class Integer_odd_even_neg_pos {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter length of element:");
		 int length=sc.nextInt();
		 int[] a=new int[length];
		 int[] e=new int[length];
		 int[] o=new int[length];
		 int[] p=new int[length];
		 int[] n=new int[length];
		 System.out.println("enter "+length+" elements");
		 for(int i=0;i<length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 int e1=0,o1=0,n1=0,p1=0;
		 for(int i=0;i<length;i++)
		 {
			 if( (a[i]%2==0))
			 {
				 e[e1]=a[i];
				 e1++;
			 }
			 if( (a[i]%2!=0))
			 {
				 o[o1]=a[i];
				 o1++;
			 }
			 if( (a[i]<0))
			 {
				 n[n1]=a[i];
				 n1++;
			 }
					 
			 if( (a[i]>0))
			 {
				 p[p1]=a[i];
				 p1++;
			 }
		 }
		
		
		
		 
		 int l=0;
		 System.out.println("even no");
		 for(int i=0;i<e1;i++)
		 {
			 System.out.print(e[i]+" ");
		 }
		 System.out.println("even="+e1);
		 System.out.println();
		 System.out.println("odd no");
		 for(int i=0;i<o1;i++)
		 {
			 System.out.print(o[i]+" ");
		 }
		 System.out.println("odd="+o1);
		 System.out.println();
		 System.out.println("negative no");
		 for(int i=0;i<n1;i++)
		 {
			 System.out.print(n[i]+" ");
		 }
		 System.out.println("neg="+n1);
		 System.out.println();
		 System.out.println("positive no");
		 for(int i=0;i<p1;i++)
		 {
			 System.out.print(p[i]+" ");
		 }
		 System.out.println("pos="+p1);
		

	}

}
