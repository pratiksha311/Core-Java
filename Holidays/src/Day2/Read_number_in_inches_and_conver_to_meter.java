 package Day2;

import java.util.Scanner;

public class Read_number_in_inches_and_conver_to_meter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number in inches");
		 double inches=sc.nextDouble();
		 double meter =inches*0.0254;
		 System.out.println("inches in meter : "+meter);

	}

}
