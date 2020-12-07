package HW_Class;

import java.util.Scanner;

public class Temprature {


		int tc,tf;
		Scanner sc=new Scanner(System.in);
		void inputC()
		{
			System.out.println("enter temprature in celcius : ");
			tc=sc.nextInt();
			
		}
		void inputF()
		{
			System.out.println("enter temprature in fahreneit : ");
			tf=sc.nextInt();
		}
		void fahreneit() 
		{
			 tf=(tc*9/5)+32;
			System.out.println("temprature in fahreneit is "+tf);
			System.out.println();
			System.out.println();
			System.out.println("***********************************************************");
			System.out.println();
			System.out.println();
		}
		void celsius()
		{
			tc= (tf-32)*5/9;
			System.out.println("temprature in celcius is "+tc);
		}
		
		public static void main(String args[]) {
			 Temprature t=new  Temprature();
			 t.inputC();
			 t.fahreneit();
			 t.inputF();
			 t.celsius();
		}

}
