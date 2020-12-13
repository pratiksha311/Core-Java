package HW;

import java.util.Scanner;

public class Pass_parameter_to_array {
	
	void display(int[][] a,int a_len)
	{
		
		for(int i=0;i<a_len;i++)
		{
			for(int j=0;j<a_len;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of elements");
		int length=sc.nextInt();
		int a[][]=new int[length][length];
		System.out.println("enter "+length*length+" elements");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		Pass_parameter_to_array p1=new Pass_parameter_to_array();		
		p1.display(a, length);

	}

}
