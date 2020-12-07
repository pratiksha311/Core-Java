package HW;

public class Manager1 extends Employee1{
	
	
	Manager1(long employeeId,String employeeName,String employeeAdress,long employeePhone,double basicSalary,String designation,double hra)
	{
	super(employeeId, employeeName, employeeAdress, employeePhone, basicSalary, designation);
		
	}
	void calculateTransportAllowance()
	{
		double transportationAllowance=	0.15*basicSalary;
		
		System.out.println("basic salary="+basicSalary+"Trainee transportationAllowance="+transportationAllowance);
	}



}

