package CW;

import java.util.Scanner;

public class Rectangle {
	int lenght,width;
	 Rectangle()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter lenght,width");
		 this.lenght=sc.nextInt();
		 this.width=sc.nextInt();
	 }
	 void rectangleArea()
	 {
		 int area=lenght*width;
		 System.out.println("area of rectangle="+area);
	 }
	 void rectanglePerimeter()
	 {
		 int perimeter=2*(lenght+width);
		 System.out.println("rperimeter of rectangle="+perimeter);
	 }

}
