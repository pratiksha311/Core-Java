package HW;

public class Rectangle extends Square {
	
	int lenght,breadth;
	Rectangle(int side,int lenght,int breadth)
	{
         super(side);
		this.lenght=lenght;
		this.breadth=breadth;
	}
	void area()
	{
		super.area();
		int area=lenght*breadth;
		System.out.println("area of rectangle="+area);
	}
	

}
