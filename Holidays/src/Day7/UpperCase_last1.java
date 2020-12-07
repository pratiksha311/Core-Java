package Day7;

import java.util.Scanner;

public class UpperCase_last1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any String");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>c[i])
			{
				c[i]=c[i];
			}
			else
			
				{
					for(int j=i+1;j<c.length;j++)
					{
						if(c[i]<c[j])
						{
						char temp=c[i];
						c[i]=c[j];
						c[j]=temp;
						}
					}
				}
			System.out.print(c[i]+" ");
		
		}
				
	}

}
