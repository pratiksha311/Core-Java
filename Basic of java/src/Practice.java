import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		  int unit=500;
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter any value ");
//        n=sc.nextInt();
		int bsalary=12000;
		double hra,da;
		if(bsalary<=10000)
		{
			hra=0.20*bsalary;
			da=0.80*bsalary;
		}
		else 
		if(bsalary<=20000)
		{
			hra=0.25*bsalary;
			da=0.90*bsalary;
		}
		else
		{
			hra=0.30*bsalary;
			da=0.95*bsalary;
		}
		double gs=hra+da+bsalary;
		System.out.println(gs);
		
	}

}
