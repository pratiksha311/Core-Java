
public class Diamond_Pyramid {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
			
			if(i==5)
			{
				System.out.print(k);
			}
			else
			{
				System.out.print(k+" ");
			}
		}
			System.out.println();
		}
	}

}
