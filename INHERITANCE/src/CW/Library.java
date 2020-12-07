package CW;

import java.nio.charset.CoderMalfunctionError;

public class Library extends College {
	String name,adress;
	int code,openingtime,closingtime;
	long phoneno;
	Library(String name, String adress, int code, int openingtime, int closingtime, String name2, String adress2,
			int code2, int openingtime2, int closingtime2, long phoneno)
	{
		super(name, adress, code, openingtime, closingtime);
		this.name=name;
		this.adress=adress;
		this.code=code;
		this.openingtime=openingtime;
		this.closingtime=closingtime;
		this.phoneno=phoneno;
	}
	@Override
	public String toString(){
		return "Library [name=" + name + ", adress=" + adress + ", code=" + code + ", openingtime=" + openingtime
				+ ", closingtime=" + closingtime + ", phoneno=" + phoneno + ", toString()=" + super.toString()
				+  "]";
	}

//	void display()
//	{
//		System.out.println("Library [name=" + name + ", adress=" + adress + ", code=" + code + ", openingtime=" + openingtime
//				+ ", closingtime=" + closingtime + ", phoneno=" + phoneno + "]");
//	}
	
	
}
