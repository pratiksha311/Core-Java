package CW;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;

public class usage8_of_throw_and_throws_ {
	
	static void m1() throws FileNotFoundException
	{
		FileReader f1=new FileReader("a.sql");
	}
	
	static void m2() throws FileAlreadyExistsException, Exception
	{
	
		m1();
		try
		{
	
		throw new FileAlreadyExistsException("file is already present");
		}
		catch(FileAlreadyExistsException f)
		{
			System.out.println(f);
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		m2();

	}

}
