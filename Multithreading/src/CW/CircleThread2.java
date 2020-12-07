package CW;

public class CircleThread2 extends Thread{
	
	Circle c;
	CircleThread2(Circle c)
	{
		this.c=c;
	}
	public void run()
	{
		c.output();
	}

}
