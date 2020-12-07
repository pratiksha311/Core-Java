package HW;

import java.util.Scanner;

public class Maximum_occuring_charecter_20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		char[] c2=new char[c1.length];
	    int[] temp=new int[c1.length];
	    int m=0;
		for(int i=0;i<c1.length;i++)
		{
			int count=1;
			
			
			{
				for(int j=i+1;j<c1.length;j++)
				{
					if(c1[i]==c1[j])
					{
						 temp[i]=count++;
						c1[j]='0';
					}
				}
				temp[i]=count;
			
			}
			
			if(c1[i]!='0')
			{
				c2[i]=c1[i];
			System.out.println(c1[i]+" "+count);
			//System.out.println("c2[i]="+c2[i]);
			}
		}
		int k=0;
		int large=temp[0];
		for(int i=1;i<c1.length;i++)
		{
			if(large<=temp[i])
			{
				large=temp[i];
				k=i;
				System.out.println("k="+k);
			}
		}
		for(int i=0;i<c2.length;i++)
		{
			if(temp[i]==large)
			{
	        	System.out.println(c2[i]+" is occuring maximum times");
			}
	
		}

	}

}
