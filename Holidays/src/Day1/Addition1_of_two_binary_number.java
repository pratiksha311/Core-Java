package Day1;

import java.util.Scanner;

public class Addition1_of_two_binary_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first binary number : ");
		String x=sc.next();
		System.out.println("enter second binary number: ");
		String y=sc.next();
		
		int n1=Integer.parseInt(x, 2);
		int n2=Integer.parseInt(y, 2);
		int n3=n1+n2;
		System.out.println("n1 : "+Integer.toBinaryString(n1));
		System.out.println("n2 : "+Integer.toBinaryString(n2));
		System.out.println(x+" + "+y+" = "+Integer.toBinaryString(n3));
		

	}

}
