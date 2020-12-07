package Day4;

import java.util.Scanner;

public class Common1_value_of_each_rowinMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of matrix");
		int length=sc.nextInt();
		int[][] c=new int[length][length];
		System.out.println("enter "+length*length+" numbers");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				int count=1;
				for(int k=i+1;k<length;k++)
				{
					for(int m=0;m<length;m++)
					{
						if(c[k][m]==c[i][j])
						{
							//System.out.println("c["+k+"]["+m+"]"+c[k][m]);
							count++;
							//System.out.println("count="+count);
						}
					}
				}
				if(count==length)
				{
					System.out.println(c[i][j]);
				}
			}
		}
	}

}
