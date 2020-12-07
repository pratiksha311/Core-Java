package HW_method;

public class Overloade {

	void test()
	{
		int a=10;
		int b=20;
		System.out.println("a="+a+" "+"b= "+b);	
	}
	void test(int a,int b)
	{
		System.out.println("a="+a+" "+"b= "+b);	
	}
	
    void test(float a,float b)
    {
    	float c=a+b;
    	System.out.println("c="+c);
    	
    	
    }
    void test(double a,double b)
    {
    	double c=a+b;
    	System.out.println("c="+c);
    }

}
