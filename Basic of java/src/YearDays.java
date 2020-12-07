
public class YearDays {

	public static void main(String[] args) {
		int x=373;
		int y,w,d;
		y=x/365;
		w=(x%365)/7;
		d=(x%365)%7;
		System.out.println("year="+y + " week ="+w + " days ="+d);

	}

}
