package HW;

import java.util.Scanner;

public class Remove_charecter_15 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		System.out.println("enter remove charecter");
		char remove=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			if(remove==c1[i])
			{
				for(int j=i;j<c1.length-1;j++)
				{
					c1[j]=c1[j+1];
				}
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println("remove charecter not present");
		}
		else
		{
			for(int i=0;i<c1.length-1;i++)
			{
				System.out.print(c1[i]+" ");
			}
		}

	}

}
