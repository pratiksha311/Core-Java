package Day2;

import java.util.Scanner;

public class Convert_minutes_into_years_and_days {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter minutes");
	long minutes=sc.nextInt();
	long yrs= (minutes/(24*60*365));
	System.out.println("years : "+yrs);
	int days=(int) ((minutes/60/24)%365);
	System.out.println("days : "+days);
}

}
