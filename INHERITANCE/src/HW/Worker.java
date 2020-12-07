package HW;

public class Worker {
	
	String sname,saddress;
	int sage,sphoneno,salary;
	Worker(String sname,String saddress,int sage,int sphoneno,int salary)
	{
		this.sname=sname;
		this.saddress=saddress;
		this.sage=sage;
		this.sphoneno=sphoneno;
		this.salary=salary;
	}
	void displaySalary()
	{
	    System.out.println("salary="+salary);
	}
}
