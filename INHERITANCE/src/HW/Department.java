package HW;

public class Department {
	
	String departmentName,HODname;
	Department(	String departmentName,String HODname)
	{
		this.departmentName=departmentName;
		this.HODname=HODname;
	}
	void showDepartmentDetails()
	{
		System.out.println("departmentName="+departmentName+"HODname="+HODname);
	}

}
