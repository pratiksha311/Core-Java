package Day7;

import java.util.Scanner;

public class Remove_Consecative3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length+1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					if(c[j]==c[j+1])
					{
					for(int k=j+1;k<=c.length+1;k++)
					{
						c[k]=c[k+1];
					}
					}
				}
				
				c[i+1]=(char) (c[j]+5);
			}
			System.out.print(c[i]+" ");
			
		}
	

	}

}
