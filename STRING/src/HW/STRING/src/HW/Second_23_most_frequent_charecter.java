package HW;

import java.util.Scanner;

public class Second_23_most_frequent_charecter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		char[] c2=new char[c1.length];
		int[] temp=new int[c1.length];
		int k=0;
		for(int i=0;i<c1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]==c1[j])
				{
					count++;
					c1[j]='0';
				}
			}
		
			if(c1[i]!='0')
			{
				temp[i]=count;
				c2[i]=c1[i];
				System.out.println(c2[i]+":"+count);
			}
		}
		System.out.println();
		int max1=temp[0];
		int max2=0;
		int l=0;
		for(int i=0;i<c1.length;i++)
		{
		    if(max1<temp[i])
		    {
		    	max2=max1;
		    	
		    	max1=temp[i];
		    	System.out.println("max2="+max2);
		    	System.out.println("max1="+max1);
		    	l=i;
		    	//System.out.println("l="+l);
		    	//System.out.println("temp="+i+":"+temp[i]);
		    	//System.out.println("Second most frequent charecter : "+c2[l]);
		    }
		    else
		    {
		    	if(temp[i]>max2 && temp[i]!=max1)
		    	{
		    		max2=temp[i];
		    		l=i;
		    		//System.out.println("max2="+max2);
		    		//System.out.println("l="+l);
		    		//System.out.println("temp="+i+":"+temp[i]);
		    	}
		    	
		    }
		  
		
         }
		for(int i=0;i<c2.length;i++)
		{
			  if(max2==temp[i])
				{
				 System.out.println("Second most frequent charecter : "+c2[l]);
				}
		}
	
		
	}

}
