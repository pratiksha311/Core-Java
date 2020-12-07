package CW_Method;

public class Area {
	
	int area(int side)
	{
		int result=side*side;
		return result;
	}
	int area(int l,int b)
	{
		int result=l*b;
		return result;
	}
	double area(float b,int h)
	{
		double result=1/2*b*h;
		return result;
	}
	
	public static void main(String args[])
	{
		Area a1=new Area();
		int square=a1.area(2);
		int rectangle=a1.area(2,5);
		double triangle=a1.area(6,7);
		System.out.println("Area of square:"+square);
		System.out.println("Area of rectangle:"+rectangle);
		System.out.println("Area of traingle:"+triangle);
		
	}

}
