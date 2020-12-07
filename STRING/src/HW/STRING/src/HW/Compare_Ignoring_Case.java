package HW;

import java.util.Scanner;

public class Compare_Ignoring_Case {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first String");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		System.out.println("enter second String");
		String s2=sc.next();
		char[] c2=s2.toCharArray();
	    int i1=s1.compareTo(s2);
	    System.out.println("i="+i1);
	    int count=0;
	    if(c1.length==c2.length)
	    {
	    	  for(int i=0;i<c1.length;i++)
	   	   {
	   		   if( (c1[i]-c2[i])==32 ||  (c1[i]-c2[i])==-32  )
	   		   {
	   			 count++;
	   		   }
	   		 
	   	   }
	    	  if(count==c1.length)
	    	  {
	    		  System.out.println("equal");
	    	  }
	    	  else
	    		  System.out.println("not eqaul");
	    }
	    else
	    	System.out.println("not equal");
	 
	    
	}    

}
