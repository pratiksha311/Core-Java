package HW;

import java.util.Scanner;

public class CheckValue {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elementm to check present in array or not:");
		int n=sc.nextInt();
		int a[]= {21,22,23,24,25,26,27,28,29};
		int count=0,b=-1;
		for(int x:a)
		{
			if(x==n)
			{
				b=-2;
				System.out.println(n+"is present at "+count+" position");
				break;
			}
			count++;
		}
		if(count==a.length)
		{
			System.out.println("element not found");
		}

	}

}
