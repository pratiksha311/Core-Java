package HW;

public class Book {
	
	String name;
	int price;
	Author author;
	Book(String name,int price,Author author)
	{
		this.name=name;
		this.price=price;	
		this.author=author;
	}
	void showDetails()
	{
		System.out.println();
		System.out.println("name="+name+" price="+price+author.getAuthorname()+" "+author.getAge()+" "+author.getPlace());
	}
	

}
