package HW_method;

public class Cube {
	
	int height,width,depth;
	void calculate(int h,int w,int d)
	{
		height=h;
		width=w;
		depth=d;
		int volume=height*width*depth;
		System.out.println("volume of cube= "+volume);
	}

}
