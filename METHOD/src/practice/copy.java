package practice;

public class copy {

	int a=10,b=20;
	void display()
	{
		System.out.println("a="+a+" b="+b);
	}
	void copy(copy c)
	{
		a=c.a;
		b=c.b;
		
	}
	
	public static void main(String args[]) {
		
		copy c1=new copy();
		c1.display();
		copy c2=new copy();
		c2.copy(c1);
		c2.display();
		
	}
}
