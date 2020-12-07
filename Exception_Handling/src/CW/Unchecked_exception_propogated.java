package CW;

public class Unchecked_exception_propogated {
	
	static void m1()
	{
		int a=10;
		int c=a/0;
		System.out.println("in m1");
	}
	
	static void m2()
	{
	
		m1();
	}

	public static void main(String[] args) {
		
		
		m2();

	}

}
