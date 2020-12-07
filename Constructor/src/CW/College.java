package CW;

public class College {
	
	int c_id;
	String c_name;
	//method inner Class
	class MethodInnerClass{
		
		void input()
		{
			c_id=10;
			c_name="vnit";
		}
		void display()
		{
			System.out.println(" college id="+c_id+"college name="+c_name);
		}
		
	}
	
	
	//Local Inner class declare inside method
	void method1()
	{
		 System.out.println("inside local class"+c_id);
	    class LocalInnerClass{
		
		     int b;
		     LocalInnerClass()//cobstructor
		     {
		    	 b=30;
		    	
		     }
		     void displayB()
		     {
		    	 System.out.println("b="+b);
		     }
	     }
	    LocalInnerClass local=new LocalInnerClass();
	    local.displayB();
	}
	void method2()
	{
		//System.out.println("b="+b);
		System.out.println(c_name);
	}
	//end local inner class
	
	
	//Ststic inner class
	static class StaticInnerClass{
		int c;
		StaticInnerClass()//constructor
		{
			c=50;
		}
		void printC()
		{
			System.out.println("c="+c);
		}
		static void printB()
		{
			//System.out.println("b="+b);not static variable
			System.out.println("hello");
		}
		
	}
	//end of static inner class
	
	
	public static void main(String args[])
	{
		College outer=new College();
		College.MethodInnerClass obj=outer.new MethodInnerClass();
		obj.input();
		obj.display();
		outer.method1();
		College.StaticInnerClass s=new StaticInnerClass();
		s.printC();//non static method
		StaticInnerClass.printB();//static method
	}


}
