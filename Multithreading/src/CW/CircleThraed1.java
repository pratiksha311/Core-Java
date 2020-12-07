package CW;

public class CircleThraed1 extends Thread{
	
	Circle c;
	CircleThraed1(	Circle c)
	{
		this.c=c;
	}
	public void run()
	{
		c.input();
		
	}

}
