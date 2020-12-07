package HW;

import java.util.Scanner;

public class All_Leaders_in_array {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("enter length of array:");
        int length=sc.nextInt();
        int a[]=new int[length];
        System.out.println("enter  "+length+" elements");
        for(int i=0;i<length;i++)
        {
        	a[i]=sc.nextInt();
        }
		int count=0;
	//.out.println("leader in array");
		  int max=a[length-1];
		 
		for(int i=length-2;i>=0;i--)
		{
			 count++;
			if(max<a[i])
			{
				max=a[i];
				System.out.print(max+" ");
				
			}
		}
		System.out.println("count="+count);
		if(count==length-1)
		{
			System.out.println("leaders not present");
		}

	}

}
