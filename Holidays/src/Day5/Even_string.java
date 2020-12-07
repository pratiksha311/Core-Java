package Day5;

import java.util.Scanner;

public class Even_string {

	public static void main(String[] args) {
		System.out.println("enter no of String");
		Scanner sc=new Scanner(System.in);
		
		int length=sc.nextInt();
		System.out.println("enter "+length+" String");
		String[] s=new String[length];
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("even string");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()%2==0)
			{
				System.out.println(s[i]);
			}
		}
		
		

	}

}
