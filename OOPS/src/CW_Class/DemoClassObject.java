package CW_Class;

import java.util.Scanner;

public class DemoClassObject {
	String name;
	int rollno;
	String address;
	
	void getData()
	{
		System.out.println("enter name,roolno,address");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		rollno=sc.nextInt();
		address=sc.next();
	}
	void displayData()
	{
		System.out.println("name="+name+"rollno="+rollno+"address="+address);
	}
	
	public static void main(String args[])
	{
		DemoClassObject d1=new DemoClassObject();
		d1.getData();
		d1.displayData();
	}
	

}
