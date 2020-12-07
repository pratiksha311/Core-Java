package HW;

import java.util.Scanner;

public class reverse_each_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  string");
	    String s1=sc.nextLine();
	    String word[]=s1.split(" ");
	    String rs="";
	   
		for(int i=0;i<word.length;i++)
		{
			String words=word[i];
			 String rw="";
			for(int j=words.length()-1;j>=0;j--)
			{
				rw=rw+words.charAt(j);
			}
			rs=rs+rw+" ";
		}
		System.out.println("rs="+rs);
	}

}