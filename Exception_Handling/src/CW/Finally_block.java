package CW;

public class Finally_block {
	
	static int m1()
	{
		int a=1;
		int b=2;
		if(a>b)
			return 10;
		else
		{
			try
			{
				
			}
			finally
			{
				System.out.println("finally");
			}
		}
		return 20;

	}
	public static void main(String[] args) {
		
		System.out.println(m1());

	}

}
