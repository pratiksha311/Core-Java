package HW;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class InvalidUserName extends Exception{
	
	InvalidUserName(String s)
	{
		super(s);
	}
}
