package HW_Class;

public class LaptopDemo {

	int result;
	void add(int n1,int n2)
	{
		result=n1+n2;
		System.out.println("addition ="+result);
	}
	void sub(int n1,int n2)
	{
		result=n1-n2;
		System.out.println("substraction ="+result);
	}
	void mul(int n1,int n2)
	{
		result=n1*n2;
		System.out.println("multiplication ="+result);
	}
	void exit()
	{
		System.out.println("Bye c u soon");
		System.exit(0);
	}

}
