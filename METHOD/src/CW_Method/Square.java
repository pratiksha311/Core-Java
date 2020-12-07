package CW_Method;

public class Square {
	
	int area;
 int calaculateArea(int length)
	{
		area=length*length;
		return area;
	}
 void display()
 {
	 System.out.println("area of square ="+area);
 }
 
 public static void main(String arga[])
 {
	 int area;
	 Square  s=new  Square ();
	 s.calaculateArea(20);
	s.display();
 }

}
