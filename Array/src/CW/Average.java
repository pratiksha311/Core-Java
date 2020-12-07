package CW;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		int[] a=new int[length];
		System.out.println("enter "+length+" element");
		for(int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/length;
		System.out.println("avg="+avg);
	}

}
