package CW;

public class Still_finally_block_executed {
	
	static void m1()
	{
		int a=10;
		if(a>0)
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
				try
				{
				int c= a/0;
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
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
	
		
	}

	public static void main(String[] args) {
		m1();
		
	}

}
