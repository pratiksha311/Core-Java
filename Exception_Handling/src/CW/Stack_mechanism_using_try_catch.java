package CW;

public class Stack_mechanism_using_try_catch {
	
	
	static void m1()
	{
		System.out.println("in m1");
		m2();
	}
    static void m2()
    {
    	
    	int a=5/0;

    }
	public static void main(String[] args) {
		
		System.out.println("i am in main");
		try {
		m1();
		}
		catch(ArithmeticException e)
    	{
    		System.out.println(e);
    	}
	}

}
