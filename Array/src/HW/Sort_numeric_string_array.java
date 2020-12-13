package HW;

import java.util.Scanner;

public class Sort_numeric_string_array {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter length of array");
//		int length=sc.nextInt();
//		int a[]=new int[length];
//		
//		System.out.println("enter "+length+ " element");
//		for(int i=0;i<length;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		for(int i=0;i<length;i++)
//		{
//			for(int j=i+1;j<length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		
//		}
//		for(int i=0;i<length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		String s1="shital";
		char ch[]= s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
		
	}

	private static int length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
