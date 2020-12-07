package HW;

public class Manager extends Worker {
	
	String department;
	
	Manager(String sname,String saddress,int sage,int sphoneno,int salary,String department)
	{
		super(sname,saddress,sage,sphoneno,salary);
		this.department=department;
	}

	void displayDepartmentDetaile()
	{
		System.out.println("sname="+sname+"saddress="+saddress+"sage="+sage+"sphoneno="+sphoneno+"salary="+salary+"department="+department);
	
	}
	
	

}
