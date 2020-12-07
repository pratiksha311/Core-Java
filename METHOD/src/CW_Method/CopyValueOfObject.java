package CW_Method;

public class CopyValueOfObject {
	
    int a,b;
    void setData()
    {

    	 a=10;
    	 b=20;
    }
    void display()
    {
    	System.out.println("a= "+a+"b= "+b);
    }
    
    void copy(CopyValueOfObject c)
    {
    	a=c.a;
    	b=c.b;
    }
    public static void main(String args[])
    {
    	CopyValueOfObject o1=new CopyValueOfObject();
    	CopyValueOfObject o2=new CopyValueOfObject();
    	o1.setData();
    	o1.display();
    	o2.copy(o1);
    	o2.display();
    }

	
}
