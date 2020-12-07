package HW;

public class Finally {
	
	static void add(int a,int b)
	{
		if(b==0)
		{
			try
			{
				int c=a/b;
			}
			finally
			{
				System.out.println("c=+c");
			}
		}
		
	}

}
