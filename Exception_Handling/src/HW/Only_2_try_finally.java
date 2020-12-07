package HW;

import java.io.FileReader;

public class Only_2_try_finally {
	
	
	static void m1()
	{
		try
		{
		FileReader f1=new FileReader("C:\\Users\\ACER\\Desktop\\syste.sql");
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		finally
		{
			System.out.println();
			System.out.println("file read");
		}
	}

	public static void main(String[] args) {
		
		m1();

	}

}
