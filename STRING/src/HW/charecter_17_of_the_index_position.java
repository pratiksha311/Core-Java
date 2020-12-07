package HW;

import java.util.Scanner;

public class charecter_17_of_the_index_position {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			
			System.out.print(i+":"+c1[i]+" ");
		    count++;
		    if(count==3)
		    {
		    	i=i+2;
		    	count=0;
		    }
		  
		}
	}

}
