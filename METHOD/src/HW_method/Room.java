package HW_method;

import java.util.Scanner;

public class Room {
	
	int length,width,height;
	int area;
	Room()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length,width,height  ");
		length=sc.nextInt();
		width=sc.nextInt();
		height=sc.nextInt();
	}
	float whiteWashingArea()
	{
		area=2*(length*width)*height+length*width;
        return area;
	}
	int whiteWashingCost()
	{
		
	 int cost=area*80;
	
		return cost;
	}
	int flooringCost(int ch)
	{ 
		//System.out.println("for flooring cost");
		if(ch==1)
		{
		int cost_gf=area*200;
		//System.out.println("geometric flooring cost :"+cost_gf);
		return cost_gf;
		}
		else
		{
		int cost_cf=area*100;
		
		//System.out.println("cement flooring cost :"+cost_cf);
		return cost_cf;
		}
	}

}
