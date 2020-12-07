package CW;

public class Addmission extends Thread{
	
	Registration t1;
	Addmission(Registration t1)
	{
		this.t1=t1;
		
	}
	public void run()
	{
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("addmission..");
	}

}
