package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sum_of_left_and_roght_subarray {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter length of first array");
		
		
		int length1=Integer.parseInt(br.readLine());
		
		int[] a=new int[length1];
		System.out.println("enter "+length1+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		for(int i=0,l=a.length-1;i<a.length/2;i++,l--)
		{
			if(l>a.length/2)
			{
			   sum=sum+a[i]+a[l];
			}
		}
		System.out.println("sum="+sum);
        
	}

}
