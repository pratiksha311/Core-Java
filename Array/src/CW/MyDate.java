package CW;

public class MyDate {
	
	int date,month,yr;
	MyDate(int date,int month,int yr)
	{
		this.date=date;
		this.month=month;
		this.yr=yr;
	}
	public String toString() {
		return ("date=" + date + ", month=" + month + ", yr=" + yr );
	}
	

}
