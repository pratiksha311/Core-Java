package CW;

public class College {
	
	String name,adress;
	int code,openingtime,closingtime;
	public College(String name, String adress, int code, int openingtime, int closingtime) {
		
		this.name = name;
		this.adress = adress;
		this.code = code;
		this.openingtime = openingtime;
		this.closingtime = closingtime;
	}

	public String toString() {

		return "College [name=" + name + ", adress=" + adress + ", code=" + code + ", openingtime=" + openingtime
				+ ", closingtime=" + closingtime + "]";
	}
	
}
