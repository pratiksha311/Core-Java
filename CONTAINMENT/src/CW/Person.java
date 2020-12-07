package CW;

public class Person {
	
	String pname,pjobname,pjoblocation;
	int paadharno,pjobid;
	Address address=new Address(10,"pune","mh","India");
	Person(String pname,String pjobname,String pjoblocation,int paadharno,int pjobid)
	{
		super();
		this.pname=pname;
		this.pjobname=pjobname;
		this.pjoblocation=pjoblocation;
		this.paadharno=paadharno;
		this.pjobid=pjobid;
	}

	
	void displayPersonDetails()
	{
		System.out.println("pname="+pname+" pjobname="+ pjobname+" pjoblocation="+pjoblocation+" paadharno="+paadharno+" pjobid="+pjobid);
	    address.displayAddress();
	}

}
