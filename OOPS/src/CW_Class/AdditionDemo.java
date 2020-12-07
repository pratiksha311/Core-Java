package CW_Class;

import java.util.Scanner;

public class AdditionDemo {
	int n1,n2,result;
	void add(int n1,int n2)
	{
		result=n1+n2;
		System.out.println("addition ="+result);
	}
	void sub(int n1,int n2)
	{
		result=n1-n2;
		System.out.println("substraction ="+result);
	}
	void mul(int n1,int n2)
	{
		result=n1*n2;
		System.out.println("multiplication ="+result);
	}
	void div(int n1,int n2)
	{
		double result=n1/n2;
		
		System.out.println("division ="+result);
	}

}
