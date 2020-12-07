package HW;

import java.util.Scanner;

public class last_index_ofString_8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		System.out.println("enter second String");
		String s2=new String(sc.next());
		char[] c2=s1.toCharArray();
		int count=0;
		int k=0;
		for(int i=0;i<c1.length;i++)
		{
				if(c2[i]==c1[i])
				{
					count++;
				}
				if(count==2)
				{
					k=i-1;
					count=0;
				}
			
		}
		System.out.println("last index of string within string:"+k);
		
	}

}
