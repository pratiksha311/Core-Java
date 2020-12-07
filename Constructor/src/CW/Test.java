package CW;

public class Test {
	
	Test()
	{
	  int n;
	}
	
	void evenOdd(int n)
	{
		if(n%2==0)
		{
			System.out.println(n+" is even number");	
		}
		else
		{
			System.out.println(n+" is odd number");	
		}
	}
	void fact(int n)
	{
		int i=1,fact=1;
		do
		{
		    fact=fact*i;
		    i++;
		}while(i<=n);
		
		System.out.println("factorial of "+n+ "is "+fact);
	}
	
	void sum(int n)
	{
		int r,sum=0,temp=0;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			 temp=temp+r;
			n=n/10;
		}
		System.out.println("sum of digits is "+temp);
	}
	
   public static void main(String args[]) {
	   
	   Test t=new Test();
	   t.evenOdd(10);
	   t.fact(5);
	   t.sum(12345);
	
}
	
	
	

}
