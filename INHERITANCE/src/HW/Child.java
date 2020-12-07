package HW;

public class Child extends Parent{
	int b;
	Child(int a,int b)
	{
		super(a);
		this.b=b;
	}
	void display()
	{
		System.out.println("a="+a+" b="+b+" c="+c);
	}
	

}
