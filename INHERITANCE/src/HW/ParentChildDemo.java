package HW;

import java.util.Scanner;

public class ParentChildDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Child c=new Child(a, b);
		c.display();
	}

}
