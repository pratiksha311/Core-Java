package Days3;

import java.util.Scanner;

public class Disarium3_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		String n=sc.next();
		char[] c=n.toCharArray();
		int sum=0;
		int s=0;
	    for(int i=0;i<c.length;i++)
	    {
	    	s=Integer.parseInt(n);
	    	int j=c[i]-48;
	    	sum=(int) (sum+Math.pow(j, (i+1)));
	    }
	    if(sum==s)
	    {
	    	System.out.println("Disarium number");
	    }
	    else
	    	System.out.println("Not Disarium number");
		
	}

}
