package CW;

public class Try_Multi_catch extends Exception{
	
	static void add(int a,int b)
	{
		
		if(b==0)
		{
			try
			{
				int c=a/b;
			}
			catch(ArithmeticException  e)
			{
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		
	}

}
