package CW;

public class Item {
	
   int n;
   boolean valueSet=false;
   
   synchronized void consume(int n)
   {
	   if(!valueSet)
	   {
		   try {
			wait();
		} catch (InterruptedException e) {
			
			System.out.println("Interrupted Execption in consumer");
		}
		   
	   }
	   
	   this.n=n;
	   System.out.println("consume="+n);
	   if(n>5)
	   {
	   valueSet=false;
	   notify();
	   }
   }
   
   synchronized void produce(int n)
   {
	   if(valueSet)
	   {
		   try {
			wait();
		} 
		catch (InterruptedException e) {
			
			System.out.println("Inturrupted Exception in producer");
		}
	   }
	   this.n=n;
	   System.out.println("produce="+n);
	   if(n==5)
	   {
	   valueSet=true;
	   notify();
	   }
	  
   }
   

}
