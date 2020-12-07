package CW_Class;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		 
		int n1,n2;
		AdditionDemo a=new AdditionDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		a.add(n1,n2);
		a.sub(n1,n2);
		a.mul(n1,n2);
		a.div(n1,n2);
		
				

	}

}
