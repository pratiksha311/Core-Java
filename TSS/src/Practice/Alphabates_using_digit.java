package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Alphabates_using_digit {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first String");
		String s1=br.readLine();
		char[] c1=s1.toCharArray();
		int[] temp=new int[c1.length];
		for(int i=0;i<c1.length;i=i+2)
		{
		    System.out.print(c1[i]);
			for(int j=1;j<(c1[(i+1)]-48);j++)
			{
				
			   System.out.print(c1[i]);
			}
		}
	}

}
