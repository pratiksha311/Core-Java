package HW;

import java.util.Scanner;

public class lowest_26_frequency_charecter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		char[] c2=new char[c1.length];
		int[] temp=new int[c1.length];
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
			temp[i]=count;
			if(c1[i]!='0')
			{
				c2[i]=c1[i];
				System.out.println(c2[i]+":"+count);
			}
		}


	
		int small=temp[0];
		for(int i=1;i<c1.length;i++)
		{
			if(small>=temp[i])
			{
				small=temp[i];
				
				
			}
			//System.out.println(small);
	   }
		
		//System.out.println("k="+k);
		for(int i=0;i<c1.length;i++)
		{
			
			if(temp[i]==small)
			{
				
	        	System.out.println(c2[i]);
			}
	
		}
		

	}

	}
