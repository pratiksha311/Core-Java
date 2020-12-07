package HW;

public class Employee1 {
	
	long employeeId,employeePhone;
	String employeeName,employeeAdress;
	double basicSalary,speciAlallowanc=250.80,hra=1000.50;
	String designation;
	
	Employee1(long employeeId,String employeeName,String employeeAdress,long employeePhone,double basicSalary,String designation)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAdress=employeeAdress;
		this.employeePhone=employeePhone;
		this.basicSalary=basicSalary;	
		this.designation=designation;
	}
	void calculateSalary()
	{
		double salary=basicSalary+(basicSalary*speciAlallowanc/100)+(basicSalary*hra/100);
		System.out.println("salary="+salary);
	}
	
	void calculateTransportAllowance()
	{
		double transportationAllowance=0.10*basicSalary;
		//double salary=10*basicSalary/100;
		System.out.println("Transportation allowance"+transportationAllowance);
		System.out.println("employee basic salary="+basicSalary);
	}
	

}
