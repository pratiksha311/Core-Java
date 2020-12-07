package HW;

public class Triangle extends Rectangle {
	
	int side1,side2,side3;
	Triangle(int side,int lenght,int breadth,int side1,int side2,int side3)
	{
		super(side, lenght, breadth);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	void area()
	{
	   super.area();
	   double s=(side1+side2+side3)/2;
	   double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	   System.out.println("area of triangle="+area);
	}

}
