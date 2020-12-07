package HW;

public class FinalMethod extends FinalVariable{
	
	int e;
	FinalMethod(int a,int c,int d,int e)
	{
		super(a, c, d);
		this.e=e;
	}
	final void display2()
	{
		System.out.println("e="+e);
		super.display();
	}

}
