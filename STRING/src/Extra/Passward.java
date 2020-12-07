package Extra;

import java.util.Scanner;

public class Passward {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter passward");
		String password=sc.next();
		char[] c=password.toCharArray();
		int alpha=0;
		int upper=0;
		int digit=0;
		int special=0;
			for(int i=0;i<c.length;i++)
			{
				if(c[i]>='a' && c[i]<='z')
				{
					alpha++;
				}
				if(c[i]>='A' && c[i]<='Z')
				{
					upper++;
				}
				if(c[i]>='a' && c[i]<='z')
				{
					digit++;
				}
				else
				{
					special++;
				}
			}
			if(alpha==0 || upper==0 || digit ==0 || special==0 || (c.length<8 && c.length>15))
			{
				System.out.println("enter atleast one special ,lower,upper,digit");
				System.out.println("passward length must be greater than 8	");
			}
			else
			{
				System.out.println("password is accepted");
			}
		
	

	}

}
