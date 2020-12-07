package Extra;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no string");
		int length=sc.nextInt();
		String[] s=new String[length];
	    for(int i=0;i<s.length;i++)
	    {
	    	s[i]=sc.next();
	    }
	    for(int i=0;i<s.length;i++)
	    {
	    	int count=1;
	    	for(int j=i+1;j<s.length;j++)
	    	{
	    		if(s[i].equals(s[j]))
	    		{
	    			count++;
	    		}
	    						
	    	}
	    	if(count>1)
	    	{
	    		System.out.println(s[i]);
	    		System.out.println("count="+count);
	    	}
	    }

	}

}
