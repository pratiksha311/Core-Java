import java.util.Scanner;

public class Covert_number_to_words {
	
	String conversion;
	String converWord(int n)
	{
		String[] units= {"","one","two","three","four","five","six",
				"seven","eight","nine","ten","eleven","twelve","thirteen",
				"fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		String[] tens= {"","","twenty","thirty","fourty","fifty","sixty",
				"seventy","eighty","ninety"};
		if(n<=19)
		{
		    conversion=units[n];
		}
		else if(n>=20 && n<100)
		{
			conversion=tens[n/10]+" "+units[n%10];
		}
		else if(n>=100 && n<1000)
		{
			conversion=units[n/100]+" hundred "+converWord(n%100);
		}
		else if(n>=1000 && n<100000)
		{
			conversion=units[n/1000]+" thousand "+converWord(n%1000);
		}
		return conversion;
	}

	public static void main(String[] args) {
		Covert_number_to_words  c=new Covert_number_to_words();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=sc.nextInt();
	System.out.println(c.converWord(n));

	}

}
