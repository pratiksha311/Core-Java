package HW;

import java.util.Scanner;

public class indexOf_allCharecter_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(c[i]+" is present at "+i+" index");
		}

	}

}
