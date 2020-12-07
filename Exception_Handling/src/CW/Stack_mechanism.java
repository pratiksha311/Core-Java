package CW;

public class Stack_mechanism {
	
	static void m1()
	{
		System.out.println(" m1 starts");
		m2();
		System.out.println(" m1 ends");
	}
	static void m2()
	{
		int a=10/0;
	
		System.out.println("i am in m2");
	}
    
	public static void main(String[] args) {
	System.out.println("in main starts");
	m1();
	System.out.println("in main ends");
	}
}
