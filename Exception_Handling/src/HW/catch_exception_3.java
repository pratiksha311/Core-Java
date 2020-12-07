package HW;

public class catch_exception_3 {
	
	
    void m1()
	{
		System.out.println("in m1");
	}

	public static void main(String[] args) {
		catch_exception_3 c1=new catch_exception_3();
		System.out.println("hello");
		
		try
		{
			Class.forName("A.java");
			 c1.m1();
			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
