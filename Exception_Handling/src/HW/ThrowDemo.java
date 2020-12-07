package HW;

import java.util.Scanner;

public class ThrowDemo {
	
   static int division(int dividend,int divisor)
	{
		int result=dividend/divisor;
		return result;
		
	}	

		public static void main(String[] args) {
		ThrowDemo t1=new ThrowDemo();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter devidend");
		int d1=sc.nextInt();
		System.out.println("enter divisor");
		int d2=sc.nextInt();
		double c=d1/d2;
		if(d2==0)
		{
			try
			{
				throw new Demo_8("divisor can not be zero");
			}
			catch(Demo_8 e)
			{
				System.out.println(e);
			}
			finally
			{
				//division(d1, d2);
				System.out.println("the result is "+c);
			}
		}
		else
		{
		
			double result=	t1.division(d1, d2);
			System.out.println("result="+result);
		}

		
	}

}
