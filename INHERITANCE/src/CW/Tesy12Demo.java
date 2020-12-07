package CW;

import java.util.Scanner;

public class Tesy12Demo {

public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter CollegeName and Adress");
	String colname=sc.next();
	String coladrs=sc.next();
    Book b=new Book("Orchid","Solapur",1019, 9, 5, "OrchidLibrary","A building 2nd floor", 1011, 6, 22,2201009,"Java  The Complete Reference", "1", "Amol", 100, 700);

   // Book b2=new Book(colname,coladrs,1019, 9, 5, "Library","B building 2nd floor", 1012, 7, 18,2201009,"CPP ", "1", "Balgurusami", 200, 400);
//Book b=new Book(name, adress, code, openingtime, closingtime, name2, adress2, code2, openingtime2, closingtime2, phoneno, bookname, bid, author, quantity, price)
   System.out.println(b);
//System.out.println(b2);
}

}
