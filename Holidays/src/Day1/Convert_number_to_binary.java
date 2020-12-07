package Day1;

import java.util.Scanner;

public class Convert_number_to_binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int x=sc.nextInt();
		int[] b=new int[20];
		int index=0;
		while(x>0)
		{
			b[index]=x%2;
		  index++;
			x=x/2;
		}
		System.out.println("In binary");
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}

	}

}
