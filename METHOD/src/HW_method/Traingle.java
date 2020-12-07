package HW_method;

import java.util.Scanner;
public class Traingle {
	
	int side1,side2,side3,angle1,angle2,angle3;
	void trianglePerimeter(int side1,int side2,int side3)
	{
		
		int perimeter=side1+side2+side3;
		System.out.println("area of perimeter="+perimeter);
	}
	
    void tringleArea(int side1,int side2)
	{
    	
		double area=(0.5*side1*side2);
		System.out.println("area of traingle="+area);
	}
	void isosceles(int angle1,int angle2,int angle3)
	{
		
	   if((angle1==angle2) || (angle2==angle3) || (angle3==angle1))
	   {
		  
		   System.out.println("isosceles traingle");
		  // float area=(angle2/4)*(Math.sqrt(4*angle2*angle2-angle1*angle1));
		   
	   }
	   else
	   {
		   System.out.println("not isosceles traingle");
	   }
	  
	}
	void equilateral(int angle1,int angle2,int angle3)
	{
		
		if((angle1==angle2) && (angle2==angle3) && (angle3==angle3))
		{
			System.out.println("eqilateral traingle");
			int area=(int) ((Math.pow(3, 0.5)/4)*angle1*angle2);
			System.out.println("area of equi"+area);
		}
		else
		{
			System.out.println("not eqilateral traingle");
		}
	}
	void rightTraingle(int angle1,int angle2,int angle3)
	{
		
		if(((angle1+angle2)<=angle3) || ((angle2+angle3)<=angle1) || ((angle1+angle3)<=angle2) )
		{
			System.out.println("right angle traingle");
		}
		else
		{
			System.out.println("not right angle traingle");
		}

	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Traingle t=new Traingle();
        t.trianglePerimeter(10, 19, 23);
        t.tringleArea(12,33);
		t.isosceles(10,10,60);
		t.equilateral(5,5,5);
		t.rightTraingle(42,49,66);
	}
	

}
