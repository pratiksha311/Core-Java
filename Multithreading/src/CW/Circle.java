package CW;

public class Circle {
	
	 int radius=0;
	synchronized void input()
	 {
		 System.out.println("in input");
		 radius=10;
		 notify();
	 }
	synchronized void output()
	 {
		 if(radius==0)
		 {
			 System.out.println("in output");
			 System.out.println("waiting....");
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			 System.out.println("area of circle="+(3.14*radius*radius));
		 
	 }

}
