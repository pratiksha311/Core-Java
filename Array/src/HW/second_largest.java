package HW;

import java.util.Scanner;

public class second_largest {

	public static void main(String[] args) {
	
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter length of element:");
		 int length=sc.nextInt();
		 int[] a=new int[length];
		 System.out.println("enter "+length+" elements");
			int max1=a[0],max2=a[1];
		 for(int i=0;i<length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<length;i++)
		 {
			 if(a[i]>max1)
			 {
				 max2=max1;
				 max1=a[i];
			 }
			 else if(a[i]>max2 && a[i]!=max1)
			 {
				 max2=a[i];
			 }
		 }
		 System.out.println("second larest "+max2);

	}

}
