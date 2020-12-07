package CW;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException7{

	public static void main(String[] args) {
		
		 try
		 {
			 FileReader f1=new FileReader("C:\\Users\\ACER\\Desktop\\syst.sql");
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(e);
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println("hello");
 
	}

}
