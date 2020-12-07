package HW_Class;

import java.util.Scanner;

public class Laptop {
	
	public static void main(String[] args) {
		 
		int n1,n2;
		
		Scanner sc = new Scanner(System.in);
		LaptopDemo d1=new LaptopDemo();
		System.out.println("Welcome");
	    System.out.println("Enter Option");
		System.out.println("1:addition");
		System.out.println("2:substraction");
		System.out.println("3:multiplication");
		System.out.println("4:quit");
		int ch;
		do {
	    ch=sc.nextInt();
	    
		
	    switch(ch)
	    {
	    case 1:
	    	System.out.println("enter two number :");
			n1=sc.nextInt();
			n2=sc.nextInt();d1.add(n1,n2);
	           break;
	           
	    case 2:
	    	System.out.println("enter two number :");
			n1=sc.nextInt();
			n2=sc.nextInt();d1.sub(n1,n2);
               break;
               
	    case 3:
	    	System.out.println("enter two number :");
			n1=sc.nextInt();
			n2=sc.nextInt();d1.mul(n1,n2);
	           break;
	           
	    case 4:d1.exit();
	           break;
	           
	     default:System.out.println("enter correct choice");
	     break;
	    }
	    System.out.println("do u want to continue press 1 otherwise 0");
	    ch=sc.nextInt();
	   
		}while(ch>0);

	}


}
