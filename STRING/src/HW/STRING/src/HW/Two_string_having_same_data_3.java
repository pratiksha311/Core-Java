package HW;

import java.util.Scanner;

public class Two_string_having_same_data_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		System.out.println("enter second String");
		String s2=new String(sc.next());
		char[] c2=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=0)
			{
				for(int j=0;j<c2.length;j++)
				{
					if(c1[i]==c2[j])
					{
						
						System.out.println(c1[i]+" is same in both string");
						c1[i]=0;
					}
				}
			}
		}

	}

}
