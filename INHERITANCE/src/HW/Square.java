package HW;

public class Square {
	
	int side;

	Square(int side)
	{
		this.side=side;
	}
	void area()
	{
		int area=side*side;
		System.out.println("area of square="+area);
	}

}
