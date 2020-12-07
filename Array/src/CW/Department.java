package CW;

public class Department {
	
	int did;
	String dname;
	Department(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public String toString()
	{
		return ("did="+did+"dname="+dname);
	}
}
