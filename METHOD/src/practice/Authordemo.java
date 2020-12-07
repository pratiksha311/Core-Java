package practice;

public class Authordemo {
	
	public static void main(String args[])
	{
		
		Autor a=new Autor("bala", "pune", 50);
		Book b1=new Book("cpp", 500, a);
		b1.showDetails();
		
	}

}
