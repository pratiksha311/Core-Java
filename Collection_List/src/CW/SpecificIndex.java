package CW;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecificIndex {

	public static void main(String[] args) {
	
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any index");
		int index=sc.nextInt();
		System.out.println(a1.get(index));
	}

}
