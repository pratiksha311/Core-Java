package CW;

public class Test2 extends Test1{
	
	int num3;
	Test2(int num1,int num2,int num3)
	{
		super(num1, num2);
		this.num3=num3;
	}
	void display()
	{
		System.out.println("num1="+num1+"num2="+num2+"num3="+num3);
	}

}
