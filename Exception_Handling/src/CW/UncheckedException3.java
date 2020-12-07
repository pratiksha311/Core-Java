package CW;

public class UncheckedException3 {
	
	static void m1()
	{
		System.out.println("i am in m1");
		int a=10;
		int c=a/0;
	}

	public static void main(String[] args) {
	  
		System.out.println("in main");
		try {
		m1();
		}
		catch(ArithmeticException e)
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
