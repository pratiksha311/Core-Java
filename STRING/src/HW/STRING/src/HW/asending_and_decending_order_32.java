package HW;

import java.util.Scanner;

public class asending_and_decending_order_32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of String");
		int length=sc.nextInt();
		System.out.println("enter "+length+" strings");
	    String s1[]=new String[length];
	    for(int i=0;i<length;i++)
	    {
	    	s1[i]=sc.next();
	    }
	   String temp="0";
	   System.out.println("ascending");
	    for(int i=0;i<s1.length;i++)
	    {
	    	for(int j=i+1;j<s1.length;j++)
	    	{
	    		if(s1[i].length()>s1[j].length())
	    		{
	    			temp=s1[i];
	    			s1[i]=s1[j];
	    			s1[j]=temp;
	    		}
	    	}
	    	
	    }
	    for(int i=0;i<s1.length;i++)
	    {
	    	System.out.print(s1[i].length()+" ");
	    }
	    System.out.println("decending order");

	}

}
