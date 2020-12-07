package HW;

import java.util.Scanner;

public class leading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.nextLine());
		char[] c1=s1.toCharArray();
		char[] c2=new char[c1.length];
		int count1=0;
	      int m=0;
	      for(int i=0;i<=count1;i++)
	      {
	        	if(c1[i]==' ')
				{
					count1++;
				
				}
	        	else
	        		break;
	      }
		int count2=c1.length-1;
		System.out.println("count1="+count1);
		for(int l=c1.length-1;l>=0;l--)
		{
			if(c1[l]==' ')
			{
				count2--;
			}
			else
				break;
		}
		System.out.println("count2="+count2);
		for(int j=count1;j<=count2;j++)
		{
			c2[m]=c1[j];
			System.out.print(c2[j]);
			m++;
		}
		System.out.println(c1.length);
		System.out.println(c2.length);
		   for(int i=0;i<m;i++)
		      {
		    	  System.out.print(c2[i]);
		      }
	
		}

	}


