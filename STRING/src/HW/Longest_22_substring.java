package HW;

import java.util.Scanner;

public class Longest_22_substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		int[] temp=new int[c1.length];
		int i=0,x=0;
	    for( i=0;i<c1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]!=c1[j])
				{
					
					count++;
					System.out.println(count);
				}
				else
				{
					temp[x]=count;
					x++;
					i=count;
					count++;
					//System.out.println("i="+i);
					break;
				}
			}
			
		System.out.println("i="+i);
		System.out.println("temp[x]="+count);
			//System.out.println("count="+count);
			//end j loop	
		}
	   // System.out.println(x);
//		for(int m=0;m<x;m++)
//		{
//			System.out.println("count="+temp[m]);
//		}
	}

}
