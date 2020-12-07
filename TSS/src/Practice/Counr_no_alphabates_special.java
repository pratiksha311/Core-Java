package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Counr_no_alphabates_special {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first String");
		String s1=br.readLine();
		char[] c1=s1.toCharArray();
		int digit=0;
		int alpha=0;
		int special=0;
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]>='0' && c1[i]<='9')
			{
				digit++;
			}
			else if((c1[i]>='a' && c1[i]<='z') || (c1[i]>='A' && c1[i]<='Z'))
			{
				alpha++;
			}
			else
				special++;
		}
		System.out.println("Number : "+digit);
		System.out.println("alphabates : "+alpha);
		System.out.println("special : "+special);

	}

}
