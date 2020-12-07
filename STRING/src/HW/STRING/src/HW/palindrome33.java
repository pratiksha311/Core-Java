package HW;

import java.util.Scanner;

public class palindrome33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  string");
	    StringBuffer s2= new StringBuffer(sc.nextLine());
	    String s1=new String(s2);
	    String word[]=s1.split(" ");
	    String rs="";
	    for(int i=0;i<word.length;i++)
	    {
	    	String words=word[i];
	    	System.out.println("words="+words);
	    	String rw="";
	    	for(int j=words.length()-1;j>=0;j--)
	    	{
	    		rw=rw+words.charAt(j);
	    		
	    	}
	    	System.out.println("rw="+rw);
	    	if(rw.equals(words))
    		{
    			System.out.println(rw+" is palindrome");
    		}
	    	else
	    	{
	    		System.out.println(rw+" is not  palindrome");
	    	}
	    //	rs=rs+rw+" ";
	    }
	   // System.out.println(rs);
	}

}
