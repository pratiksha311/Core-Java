package CW;

public class DaemonThread extends Thread{
	
	public void run()
	{
		for(int i=0;i<900;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	
		

	public static void main(String[] args) {
		
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		t1.setDaemon(true);
		System.out.println("thread t1="+t1.isDaemon());
		System.out.println("thread t2="+t2.isDaemon());
		
		t1.start();
		t2.start();

	}

}
