package HW;

import java.util.Scanner;

public class reverse_19_string_using_method {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		
		String s1=new String(sc.nextLine());
		System.out.println(s1);
		char[] c=s1.toCharArray();
		int count=0;
		int[] temp=new int[c.length];
	
		System.out.println("c[]=");
		  for(int i=0;i<c.length;i++) 
		    {
			  System.out.print(c[i]);
		    }
		System.out.println();
		int k=0;
	    for(int i=0;i<c.length;i++) 
	    {
	    	if(c[i]==' ' || i==c.length-1)
	    	{
	    		count++;
	    		temp[k]=i;
	    		System.out.println("temp["+k+"]="+temp[k]);
	    		k++;
	    		//System.out.println("i="+i);
	    	}
	    }
	    System.out.println("count="+count);
	    char[][] s=new char[count][];
	    for(int i=count-1;i>=0;i--)
	    {
	    	if(i==count-1)
	    		s[i]=new char[temp[i]-temp[i-1]+1];
	    	else if(i!=0)
	    	{
	    		System.out.println("temp["+i+"]"+" "+"temp["+(i-1)+"]");
	    		s[i]=new char[temp[i]-temp[i-1]];
	    	}
	    	else if(i==0)
	    	{
	    		s[i]=new char[temp[0]];
	    	}
	    }
	    int k1=0;
	    int sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i].length;
		System.out.println("s["+i+"].length="+s[i].length);
			for(int j=0;j<s[i].length&& k1<c.length ;j++)
			{
				/*
				 * if(c[k1]==' ') { k1++; s[i][j]=c[k1];
				 * 
				 * } else if(c[k1]!=' ') {
				 */
			       s[i][j]=c[k1];
			     //  System.out.println("no space");
			       
			       
				//}
				k1++;
		//	 System.out.println("s[i][j]="+s[i][j]+"  c["+k1+"]"+c[k1]);
			
			}
		}
		System.out.println("s length="+sum);
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
		      System.out.println("s[i][j]="+s[i][j]);
			}
		}
		char t=' ';
		int m=0;
		  for(int i=0;i<s.length;i++)
		  {
			  for(int j=0,l=s[i].length-1;j<=s[i].length/2;j++,l--)
			  {
				 // if(s[i][j]!=' ')
			   t=s[i][j];
				  s[i][j]=s[i][l];
				  s[i][l]=t;
			     
			  
			  }
			//  if(i==0)
			  {
				//  s[i+1][j]=' ';
			  }
		  }
		 char c2[]=new char[c.length+1];
	    int x=0;
	    for(int i=0;i<s.length;i++)
	    {
	    	 for(int j=0;j<s[i].length;j++)
	 	    {
	    	c2[x]=s[i][j];
	    	x++;
	        }
	  
	    	 if(i==0) {
	    		 c2[x]=' ';
	    	 x++;
	    	 }
	    	// System.out.println(c2[x]);
		
	}
	    
	    System.out.println();
	    
	    for(int j=0;j<c.length;j++)
 	    {
    	System.out.print(c2[j]);
 	    }
	}
}
