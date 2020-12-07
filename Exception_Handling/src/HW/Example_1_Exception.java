package HW;

import java.util.Scanner;

public class Example_1_Exception {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter value of int");
	   try
	   {
	  int s1=sc.nextInt();
	   System.out.println("digit="+s1);
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	 
	}

}
