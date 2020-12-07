package HW;

import java.util.Scanner;

public class replace_d_with_f_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String");
		String s1=new String(sc.next());
		char[] c1=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]=='d')
			{
				c1[i]='f';
			}
			System.out.print(c1[i]+" ");
		}
	}

}
