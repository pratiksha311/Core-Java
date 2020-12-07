package CW;

public class Consumer1 extends Thread{
	
	Item t;
	Consumer1(Item t)
	{
		this.t=t;
	}
	public void run()
	{
		int i=0;
		while(i<=5)
		{
			t.consume(i++);
		}
	}

}
