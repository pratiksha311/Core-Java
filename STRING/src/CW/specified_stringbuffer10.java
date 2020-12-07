package CW;

import java.util.Scanner;

public class specified_stringbuffer10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		StringBuffer s1=new StringBuffer(sc.next());
		System.out.println("enter first string");
		StringBuffer s2=new StringBuffer(sc.next());
		String s3=new String(s1);
		String s4=new String(s1);
		if(s3.equals(s4))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}

	}

}
