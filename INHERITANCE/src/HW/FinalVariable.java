package HW;

public class FinalVariable{
	
	final int b=10;
	int c,d;
	FinalVariable(int b,int c,int d)
	{
		//this.a=a;
		this.c=c;
		this.d=d;
	}
	//int b=50; cant initialize
	void display()
	{
		System.out.println("b="+b+"c="+c+"d="+d);//b value can't comes from object
	}


}
