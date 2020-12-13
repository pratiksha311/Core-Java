package HW;

import java.util.Scanner;

public class TwoD_using_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		System.out.println("enter "+(length*length)+" elements");
		int[][] a=new int[length][length];
		for(int[] x:a)
		{
			System.out.println(x);
		}

	}

}
