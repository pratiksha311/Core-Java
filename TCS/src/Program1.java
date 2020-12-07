import java.util.Scanner;

class Program1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.next();
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					c[j]='0';
				}
			}
			if(c[i]!='0')
			{
				System.out.println(c[i]+":"+count);
				
			}
			
		}
		
	}
}
