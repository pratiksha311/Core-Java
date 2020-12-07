package practice;

public class Book{

	
		String name;
		int price;
		Autor author;
		Book(String name,int price,	Autor author)
		{
			this.name=name;
			this.price=price;
			this.author=author;
			
		}
		void showDetails()
		{
			System.out.println("name="+name+"price"+price+author.getAutorname()+author.getPlace()+author.getAge());
			
		}
	



}
