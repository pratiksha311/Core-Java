package HW_method;

import java.util.Scanner;

public class RoomDemo {

	public static void main(String[] args) {
		Room r=new Room();
		float area=r.whiteWashingArea();
		System.out.println("white washing area :"+area);
		int cost=r.whiteWashingCost();
	    System.out.println("white washing cost :"+cost);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("1-Geometric Floring Cost\n 2-CementFloring Cost");
	    int ch=sc.nextInt();
	    if(ch==1) {
		int cost_gf= r.flooringCost(1);
		System.out.println("geometric flooring cost :"+cost_gf);
	    }
	    else
	    {
	    	int cost_cf= r.flooringCost(2);
	    	System.out.println("cement flooring cost :"+cost_cf);
	    }
	


	}

}
