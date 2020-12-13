package HW;

import java.util.Scanner;

public class Coppy_Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter length of array:");
        int length=sc.nextInt();
        int a[]=new int[length];
        int b[]=new int[length];
        System.out.println("enter any "+length+" of a's elements");
        for(int i=0;i<length;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<length;i++)
        {
        	b[i]=a[i];
        }
        for(int i=0;i<length;i++)
        {
        	System.out.print(b[i]+" ");
        }
        
	}

}
