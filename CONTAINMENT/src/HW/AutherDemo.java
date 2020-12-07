package HW;

public class AutherDemo {

	public static void main(String[] args) {
	  
		Author a1=new Author("balaguruswamee","pune", 23);
		//String name=a1.authorname;
		//int age=a1.age;
		//System.out.println("authorname="+name+"age="+age);
		Book b1=new Book("cpp", 200,a1);
		b1.showDetails();

	}

}
