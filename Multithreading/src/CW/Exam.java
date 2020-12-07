package CW;

public class Exam extends Thread{
	
	Addmission t2;
	
	Exam(	Addmission t2)
	{
		this.t2=t2;
	}
	
	public void run()
	{
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("exam.......");
	}

}
