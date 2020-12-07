package practice;

import java.util.Scanner;

public class Room {
	
	
	int l,w,h,area,ch;
	Room()
	{
		l=20;
		w=30;
		h=40;
	}
	float whiteWashingarea()
	{
		area=2*(l+w)*h+(l*w);
		return area;
	}
	int whiteWashingCost()
	{
		int cost=area*80;
		return cost;
	}
	int flooringCost()
	{
	    if(ch==1)
	    {
		   int f_cost=area+200;
		   return f_cost;
	    }
	    else
	    {
	    	 int g_cost=area+200;
			   return g_cost;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r1=new Room();
		float warea=r1.whiteWashingarea();
		System.out.println("white washing area"+warea);
		int wcost=r1.whiteWashingCost();
		System.out.println("white washing cost"+wcost);
		System.out.println("1:cement flooring cost");
		Scanner sc=new Scanner(System.in);

		System.out.println("2.geometric flooring cost");
		int ch=sc.nextInt();
		if(ch==1)
		{
			int area=r1.flooringCost();
			System.out.println("cement flooring cost"+area);
		}
		else
		{
			int area=r1.flooringCost();
			System.out.println("geometric flooring cost"+area);
		}

	}

}
