package CW;

public class Book extends Library {
	String bookname,bid,author;
	int quantity;
	double price;
	public Book(String name, String adress, int code, int openingtime, int closingtime, String name2, String adress2,
			int code2, int openingtime2, int closingtime2, long phoneno, String bookname, String bid, String author,
			int quantity, double price)
	{
	    super(bookname, adress, code, openingtime, closingtime, name2, adress2, code2, openingtime2, closingtime2, phoneno);
		this.bookname = bookname;
		this.bid = bid;
		this.author = author;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", bid=" + bid + ", author=" + author + ", quantity=" + quantity + ", price="
				+ price + "]\n"+super.toString();
	}
//	void display()
//	{
//		System.out.println("Book [bookname=" + bookname + ", bid=" + bid + ", author=" + author + ", quantity=" + quantity + ", price="
//				+ price + "]\n");
//	
//	}


}