package CW;

import java.util.Scanner;

public class Test2Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of num1,num2 and num3");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		Test2 t1=new Test2(num1, num2, num3);
		t1.display();

	}

}
