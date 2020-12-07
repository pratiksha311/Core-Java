package CW;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 number");
	
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter remove");
		int remove=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==remove)
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
		System.out.print(a[i]+" ");
		}
	}	
}
	    
	
	
		
	
		

	

	

